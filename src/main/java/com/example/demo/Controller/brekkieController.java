package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Controller
public class brekkieController {
    @Value("${spring.datasource.url}")
    public String dbUrl;

    @Autowired
    public DataSource dataSource;

    @GetMapping("/frukost")
        public ModelAndView orderBreakfast() throws SQLException {
        System.out.println("Hello OrderForm!");

        //DBConnectionTest for debugging purposes
        /*SQLQuery test = new SQLQuery();
        String productName = test.getProductName();
        System.out.println(productName);*/
        //End of DBConnectionTest

        String productName = getProductName();

        System.out.println(productName);

        return new ModelAndView("orderForm.html");
        }

    @GetMapping("/alternativ")
    public ModelAndView seeBreakfastAlternatives() throws SQLException {
        System.out.println("Hello Frukostpåse!");

        //DBConnectionTest for debugging purposes
        /*SQLQuery test = new SQLQuery();
        String productName = test.getProductName();
        System.out.println(productName);*/
        //End of DBConnectionTest

        String productName = getProductName();

        System.out.println(productName);

        return new ModelAndView("displayBags.html");
    }

    public String getProductName() throws SQLException {
        String output = "failed";
        try (Connection connection = dataSource.getConnection()) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM public.\"Product\"");

            if (rs.next()) {
                output = rs.getString("Name");
            }
        }
        return output;
    }
}
