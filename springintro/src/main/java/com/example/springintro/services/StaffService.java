package com.example.springintro.services;

import com.example.springintro.entity.Staff;

import java.util.List;

public interface StaffService {
    public void createStaff(String name, int age);

    public List<Staff> getAllStaff();

    public Staff getStaff(long id);

    public void updateStaff(Staff staff);

    public void deleteStaffById(long id);
}
