package com.appsdeveloperblog.tutorials.spring.mvc.estore;

import com.appsdeveloperblog.tutorials.spring.mvc.estore.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {

    @GetMapping(path = "/users/{userId}/albums/{albumId}")
    public ModelAndView getUser(@PathVariable("userId") String userId,
                                @PathVariable("albumId") String albumId) {
        ModelAndView modelAndView = new ModelAndView("album");
        modelAndView.addObject("userId", userId);
        modelAndView.addObject("albumId", albumId);
        return modelAndView;
    }

    @GetMapping(path = "/users")
    public ModelAndView getUsers(@RequestParam(name = "limit", defaultValue = "30") int limit) {
        System.out.println("limit=" + limit);
        ModelAndView modelAndView = new ModelAndView("users");
        return modelAndView;
    }

    @PostMapping(path = "/users")
    public String signupFormSubmit(@ModelAttribute User user) {
        return "signup-result";
    }

    @GetMapping(path = "/signup")
    public String signupForm() {
        return "signup";
    }
}
