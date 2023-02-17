package com.ThinkifyLabs.CabBookingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ThinkifyLabs.CabBookingApp.CabBookingException.CabBookingException;
import com.ThinkifyLabs.CabBookingApp.Controllers.BookRide;

@SpringBootApplication
public class CabBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabBookingApplication.class, args);
		
		BookRide ride = new BookRide();
		
		try 
		{
			ride.addUser("Abhishek",'M',23); 
			ride.addUser("Rahul",'M', 29); 
			ride.addUser("Nandini",'F',22);
		
			ride.addDriver("Driver1",'M',22,"Swift","KA-01-12345",10,1);
			ride.addDriver("Driver2",'F',29,"Fortuner","KA-01-12346",11,10);
			ride.addDriver("Driver3",'M',24,"XUV300","KA-01-12347",5,3);
			
			ride.findRide("Abhishek",0,0,20,1);
			ride.findRide("Rahul",10,0,15,3);
			ride.findRide("Nandini",15,6,20,4);
			
		} 
		catch(CabBookingException e)
		{
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
		catch(Exception e)
		{
            e.printStackTrace();
        }
	
	}

}
