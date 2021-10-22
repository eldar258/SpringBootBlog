package com.fludilka.fludilka;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class WebController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @RequestMapping(value="/registration", method= RequestMethod.GET)
    public String showRegistrationForm(User user) {
        return "registrationForm";
    }

    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String checkUserInfo(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registrationForm";
        }

        return "redirect:/results";
    }
}
