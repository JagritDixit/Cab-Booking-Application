package com.ThinkifyLabs.CabBookingApp.Services;

import java.util.List;

import com.ThinkifyLabs.CabBookingApp.CabBookingException.CabBookingException;
import com.ThinkifyLabs.CabBookingApp.Entities.Driver;
import com.ThinkifyLabs.CabBookingApp.Entities.User;
import com.ThinkifyLabs.CabBookingApp.Repositories.DriverRepository;
import com.ThinkifyLabs.CabBookingApp.Repositories.RideRepository;
import com.ThinkifyLabs.CabBookingApp.Repositories.UserRepository;

public class CabService {
	
	private UserRepository userRepository;
    private DriverRepository driverRepository;
    private RideRepository rideRepository;

    public CabService()
    {
        userRepository = new UserRepository();
        driverRepository = new DriverRepository();
        rideRepository = new RideRepository();
    }

    public void addUser(String name,char gender,int age) throws CabBookingException 
    {   
    	if(userRepository.userExists(name))
    	{
    		throw new CabBookingException("User already exists");
    	}
    
    	User user = new User();
    	
        user.setName(name);
        user.setSex(gender);
        user.setAge(age);        

        userRepository.addUser(user);
    }
    
    
    public void addDriver(String name,char sex,double age,String carModel,String carNumber,int x_coordinate,int y_coordinate) throws CabBookingException
	{
    	if(driverRepository.driverExists(name)){
            throw new CabBookingException("Driver already exists");
        }
    	
		Driver driver = new Driver();
		
		driver.setName(name);
		driver.setSex(sex);
		driver.setAge(age);
		driver.setCarModel(carModel);
		driver.setCarNumber(carNumber);
		driver.setX_coordinate(x_coordinate);
		driver.setY_coordinate(y_coordinate);
		
		driver.setAvailability(true);
		
		driverRepository.addDriver(driver);
	}

    public List<String> findRide(int x, int y) 
    {
        return driverRepository.findRide(x,y);
    }

    public void chooseRide(String userName, String driverName) throws CabBookingException 
    {
        rideRepository.startRide(userName,driverName);
    }

}
