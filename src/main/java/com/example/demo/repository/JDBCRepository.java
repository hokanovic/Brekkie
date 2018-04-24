package com.example.demo.repository;

import com.example.demo.domain.Order;
import com.example.demo.domain.Product;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCRepository implements ShopRepository{
    private DataSource dataSource;
    private List<Order> orderList = new ArrayList<>();
    private List<Product> productList = new ArrayList<>();

    @Override
    public void listOrders() {
     /*   try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, customerId, orderDate," +
                     "paymentOption, marking, " +
                     "experationDate, deliveryDate, deliveryTime FROM Order")) {
            while (rs.next()) orderList.add(rsOrder(rs));
            return orderList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/
    }


    @Override
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

    @Override
    public void addOrder(int id, int customerId, String orderDate, String paymentOption, String marking,
                  String experationDate, String deliveryDate, String deliveryTime) {

    }

    @Override
     public void addProduct(int id, String name, int productCategori_id) {

    }

    /*private Order rsOrder(ResultSet rs) throws SQLException {
        return new Order(rs.getInt("id"), rs.getInt("customerId"), rs.getString("orderDate"),
                rs.getString("paymentOption"), rs.getString("marking"),rs.getString("experationDate"),
                rs.getString("deliveryDate"), rs.getString("deliveryTime"));
    }*/

    private Product rsProduct(ResultSet rs) throws SQLException {
        return new Product(rs.getInt("id"), rs.getString("name"), rs.getInt("productCategory"));
    }
}
