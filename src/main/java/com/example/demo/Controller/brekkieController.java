package com.example.demo.Controller;

import com.example.demo.DBConnectionTest.SQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;
import java.sql.SQLException;

@Controller
public class brekkieController {
    @Value("${spring.datasource.url}")
    private String dbUrl;

    @GetMapping("/frukost")
        public ModelAndView orderBreakfast() throws SQLException {

        //DBConnectionTest for debugging purposes
        SQLQuery test = new SQLQuery();
        String productName = test.getProductName();
        System.out.println(productName);
        //End of DBConnectionTest

        return new ModelAndView("orderForm.html");
        }

    @GetMapping("/alternativ")
    public ModelAndView seeBreakfastAlternatives() throws SQLException {
        System.out.println("Hello Logs!");
        //DBConnectionTest for debugging purposes
        SQLQuery test = new SQLQuery();
        String productName = test.getProductName();
        System.out.println(productName);
        //End of DBConnectionTest
        return new ModelAndView("displayBags.html");
    }
}
