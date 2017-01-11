package ru.tsandaProject.springMaven.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.tsandaProject.springMaven.model.Person;

/**
 * Created by andrej on 04/12/16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public ModelAndView home(Person person) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", person.getName());
        modelAndView.addObject("lastName", person.getLastname());
        modelAndView.setViewName("index");

        return modelAndView;
    }
}
