package com.example.demo.repository;

import com.example.demo.domain.Order;
import com.example.demo.domain.Product;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCRepository implements ShopRepository {
    private DataSource dataSource;
    private List<Order> orderList = new ArrayList<>();
    private List<Product> productList = new ArrayList<>();

    @Override
    //Creates a list of all Orders from database
    public List<Order> listOrders() {
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, customerId, orderDate," +
                     "paymentOption, marking, " +
                     "experationDate, deliveryDate, deliveryTime FROM Order")) {
            while (rs.next()) orderList.add(rsOrder(rs));
            return orderList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    //Creates a list of all Producs from database
    public List<Product> listProducts() {
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, name, productCategory FROM Product")) {
            while (rs.next()) productList.add(rsProduct(rs));
            return productList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Adds order to database
    @Override
    public void addOrder(int id, int customerId, String orderDate, String paymentOption, String marking,
                         String experationDate, String deliveryDate, String deliveryTime) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("INSERT INTO order(id, customerID, orderDate, paymentOption," +
                     "marking, experationDate, deliveryDate, deliveryTime) VALUES (?,?,?,?,?,?,?,?) ", new String[]{"id"})) {
            ps.setInt(1, id);
            ps.setInt(2, customerId);
            ps.setString(3, orderDate);
            ps.setString(4, paymentOption);
            ps.setString(5, marking);
            ps.setString(6, experationDate);
            ps.setString(7, deliveryDate);
            ps.setString(8, deliveryTime);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //Adds product to database
    @Override
    public void addProduct(int id, String name, int productCategory_id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("INSERT INTO product(id, name, productCategory_id) " +
                     "VALUES (?,?,?) ", new String[]{"id"})) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, productCategory_id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Creates new Orders from database
    private Order rsOrder(ResultSet rs) throws SQLException {
        return new Order(rs.getInt("id"), rs.getInt("customerId"), rs.getString("orderDate"),
                rs.getString("paymentOption"), rs.getString("marking"), rs.getString("experationDate"),
                rs.getString("deliveryDate"), rs.getString("deliveryTime"));
    }
    //Creates new Products from database
    private Product rsProduct(ResultSet rs) throws SQLException {
        return new Product(rs.getInt("id"), rs.getString("name"), rs.getInt("productCategory"));
    }
}
