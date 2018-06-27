/*
 * 
 * @author  Yuri Zharchuk
 * 
 */
package com.daimler.batterymonitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.daimler.batterymonitor.model.Battery;
import com.daimler.batterymonitor.model.BatteryStats;
import com.daimler.batterymonitor.model.Test;
import com.daimler.batterymonitor.repository.IBatteryRepository;
import org.springframework.http.MediaType;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * This is a way to expose RESTful API in micro services.
 * We have only two methods in this controller per assignment requirements.
 * 
 */
@RestController
public class BatteryController
{
	// as for the logger, this is a Log4J2. See Log4J2.xml configuration file. 
	private final Logger log = LogManager.getLogger(BatteryController.class);
	
	@Autowired
	IBatteryRepository batteryRepository;
	
	/*
	 * This method retrieves all vehicles from batterie's DB
	 * This method will be used internally by webapp, 
	 * as well as it can be exposed to external use.
	 */
	@GetMapping(value = "/vehicles", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Integer> getVehicles()  
	{		
		List<Integer> vehicles = batteryRepository.findVehicleModels();		
		return vehicles;		
	}
	
	/*
	 * This method retrieves only one battery data per vehicle.
	 * This method will be used internally by webapp, 
	 * as well as it can be exposed to external use.
	 */
	@GetMapping(value = "/batterybyvehicle", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Battery> getBatteryDataByVehicle(@RequestParam("vehicle") Integer vehicle)
	{
		List<Battery> batteryRecords = batteryRepository.findByVehicle(vehicle);
		return batteryRecords;
	}	
	
	/*
	 * This method retrieves calculated battery statistics.
	 * Will be use by internal webapp.
	 */
	@GetMapping(value = "/batterystats", produces=MediaType.APPLICATION_JSON_VALUE)
	public BatteryStats getBatteryStats(@RequestParam("vehicle") Integer vehicle)
	{
		List<Battery> batteryRecords = batteryRepository.findByVehicle(vehicle);
		BatteryStats batteryStats = calculateBatteryStatistics(batteryRecords);
		return batteryStats;
	}
	
	@GetMapping(value = "/test", produces=MediaType.APPLICATION_JSON_VALUE)
	public Test getTest()
	{		
		return new Test();
	}

	/*
	 * Here is a main logic of the assignment base on battery data feed analysis
	 */
	private BatteryStats calculateBatteryStatistics(List<Battery> batteryRecords)
	{
		//TODO: implement this method.
		
		// dummy data for now.
		// just for testing client app. 
		BatteryStats batteryStats = BatteryStats.createDummyBatteryStats(); 
		return batteryStats;
	}	
	
}