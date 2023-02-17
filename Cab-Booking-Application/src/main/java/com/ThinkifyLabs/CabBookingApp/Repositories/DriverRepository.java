package com.ThinkifyLabs.CabBookingApp.Repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ThinkifyLabs.CabBookingApp.Entities.Driver;

public class DriverRepository {
	
	private Map<String,Driver> driverList;
	
	public DriverRepository()
	{
		driverList = new HashMap<>();
	}
	
	public boolean driverExists(String name) 
	{
        return driverList.containsKey(name);
    }
	
	public void addDriver(Driver driver)
	{
		driverList.put(driver.getName(),driver);
	}
	
	public List<String> findRide(int x_source, int y_source) 
	{
        List<String> list = new ArrayList<>(); // returns list of driver names
        
        driverList.forEach((name,driver) -> 
        {
            if(driver.isAvailability())
            {
            	int x_driver = driver.getX_coordinate();
            	int y_driver = driver.getY_coordinate();
            	double distance = Math.sqrt((x_driver-x_source)*(x_driver-x_source) + (y_driver-y_source)*(y_driver-y_source));; // distance between driver and user
			
            	if(distance <= 5)
            		list.add(driver.getName());
            }
        });
        return list;
    }
	
}
