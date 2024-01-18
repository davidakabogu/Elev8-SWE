package com.example.springintro.controllers;

import com.example.springintro.entity.Staff;
import com.example.springintro.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/Staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView Home() {
        String info = "Welcome to SpringBoot";
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("staff/index");
        modelAndView.addObject("info", info);
        return modelAndView;
    }

    @RequestMapping(value = "/Create", method = RequestMethod.GET)
    public ModelAndView Create() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("staff/create");
        return modelAndView;
    }

    @RequestMapping(value = "/List", method = RequestMethod.GET)
    public ModelAndView List() {
        ModelAndView modelAndView = new ModelAndView();
        List<Staff> staffList = staffService.getAllStaff();
        modelAndView.setViewName("staff/list");
        modelAndView.addObject("staff", staffList);
        return modelAndView;
    }

    @RequestMapping(value = "/Register", method = RequestMethod.POST)
    public ModelAndView Register(@RequestParam(value = "userName") String name,
                                 @RequestParam(value = "userAge") int age) {
        staffService.createStaff(name, age);
        return null;
    }

    @RequestMapping(value = "/View", method = RequestMethod.GET)
    public ModelAndView View(@RequestParam(value = "id") long id) {
        Staff staff = staffService.getStaff(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("staff/view");
        modelAndView.addObject("staff", staff);
        return modelAndView;
    }

    @RequestMapping(value = "/Edit/{id}", method = RequestMethod.GET)
    public ModelAndView Edit(@PathVariable(value = "id") long id) {
        Staff staff = staffService.getStaff(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("staff/edit");
        modelAndView.addObject("staff", staff);
        return modelAndView;
    }

    @RequestMapping(value = "/Update/{id}", method = RequestMethod.POST)
    public ModelAndView Update(Staff staff, @PathVariable(value = "id") long id) {
        staff.setId(id);
        staffService.updateStaff(staff);
        return null;
    }
}
