package com.example.demo.Controller;

import com.example.demo.DBConnectionTest.SQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

@Controller
public class brekkieController {
    @Autowired
    SQLQuery sqlQuery;

    @GetMapping("/frukost")
        public ModelAndView orderBreakfast() throws SQLException {
        System.out.println("Hello OrderForm!");

        //DBConnectionTest for debugging purposes
        /*SQLQuery test = new SQLQuery();
        String productName = test.getProductName();
        System.out.println(productName);*/
        //End of DBConnectionTest

        String productName = sqlQuery.getProductName();

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

        String productName = sqlQuery.getProductName();

        System.out.println(productName);

        return new ModelAndView("displayBags.html");
    }
}
