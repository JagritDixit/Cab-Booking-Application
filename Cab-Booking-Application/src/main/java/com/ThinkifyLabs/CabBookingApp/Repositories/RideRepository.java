package com.ThinkifyLabs.CabBookingApp.Repositories;

import java.util.HashMap;
import java.util.Map;

import com.ThinkifyLabs.CabBookingApp.Entities.Ride;

//@Component
public class RideRepository {
	
	private Map<String,Ride> rideList;
	
	public RideRepository()
	{
		rideList = new HashMap<>();
	}
	
	public void startRide(String userName,String driverName)
	{
		Ride ride = new Ride();
		
		ride.setUserName(userName);
		ride.setDriverName(driverName);
		
		rideList.put(driverName,ride);
		
		System.out.println("Enjoy the ride!");
	}
	
	

}
