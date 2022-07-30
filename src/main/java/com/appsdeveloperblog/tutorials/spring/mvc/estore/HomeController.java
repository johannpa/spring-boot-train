package com.appsdeveloperblog.tutorials.spring.mvc.estore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView homePage() {

    //    Map<String, String> model = new HashMap<>();
     //   model.put("firstName", "Prénom");
     //   model.put("lastName", "Nom");

     //   ModelAndView modelAndView = new ModelAndView("home", model);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("firstName", "Prénom");
        modelAndView.addObject("lastName", "Nom");

        return modelAndView;
    }
}
