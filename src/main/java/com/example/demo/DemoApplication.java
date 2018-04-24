package com.example.demo;

import com.example.demo.DBConnectionTest.SQLQuery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello Logs!");
		SQLQuery test = new SQLQuery();
		String productName = test.getProductName();
		System.out.println(productName);
	}
}
