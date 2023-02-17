package com.ThinkifyLabs.CabBookingApp.Controllers;

import java.util.List;
import com.ThinkifyLabs.CabBookingApp.CabBookingException.CabBookingException;
import com.ThinkifyLabs.CabBookingApp.Services.CabService;

public class BookRide {
	
	private CabService cabService;

	public BookRide() {
		
		cabService = new CabService();
	}

	public void addUser(String name,char sex,int age) throws CabBookingException
	{	
		cabService.addUser(name,sex,age);
		System.out.println("User Added Successfully!");
	}
	
	public void addDriver(String name,char sex,double age,String carModel,String carNumber,int x_coordinate,int y_coordinate) throws CabBookingException
	{
		cabService.addDriver(name,sex,age,carModel,carNumber,x_coordinate,y_coordinate);
		System.out.println("Driver Added Successfully!");
	}
	
	public List<String> findRide(String userName,int x_source,int y_source,int x_dest,int y_dest)
	{
		List<String> driverList = cabService.findRide(x_source,y_source);
		
		if(driverList.size() == 0)
		{
			System.out.println("No ride found.");
		}
		else
		{
			System.out.println("List of available drivers: ");
			System.out.println(driverList);
		}
		
		return driverList;
	}
	
	public void chooseRide(String userName,String driverName) throws CabBookingException 
	{
        cabService.chooseRide(userName,driverName);
        System.out.println("Happy Journey!");
    }
	
}
