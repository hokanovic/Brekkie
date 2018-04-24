package com.example.demo.repository;
import com.example.demo.domain.Product;

import java.util.List;

public interface ShopRepository {
    void listOrders();
    List<Product> listProducts();

    void addOrder(int id, int customerId, String orderDate, String paymentOption, String marking,
                  String experationDate, String deliveryDate, String deliveryTime);
    void addProduct(int id, String name, int productCategori_id);

}
