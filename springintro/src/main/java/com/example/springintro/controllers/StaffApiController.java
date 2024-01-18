package com.example.springintro.controllers;

import com.example.springintro.entity.Staff;
import com.example.springintro.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/StaffApi")
public class StaffApiController {
    @Autowired
    private StaffService staffService;
    @RequestMapping(value = "/List", method = RequestMethod.GET)
    public ResponseEntity<?> getAllStaff(){
        List<Staff> staffList = staffService.getAllStaff();
        ResponseEntity response = new ResponseEntity(staffList, HttpStatus.OK);
                return response;
    }
}
