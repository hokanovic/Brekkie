package com.example.demo.Controller;

import com.example.demo.DBConnectionTest.SQLQuery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

@Controller
public class brekkieController {

    @GetMapping("/frukost")
        public ModelAndView orderBreakfast() throws SQLException {

        //DBConnectionTest for debugging purposes
        SQLQuery test = new SQLQuery();
        String productName = test.getProductName();
        System.out.println(productName);
        //End of DBConnectionTest

        return new ModelAndView("orderForm");
        }

    @GetMapping("/alternativ")
    public ModelAndView seeBreakfastAlternatives(){
        return new ModelAndView("displayBags");
    }
}
