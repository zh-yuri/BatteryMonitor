/*
 * 
 * @author  Yuri Zharchuk
 * 
 */
package com.daimler.batterymonitor.model;

import java.io.Serializable;
import java.sql.Timestamp;
import com.daimler.batterymonitor.utilities.Utilities;

/*
 * This class was meant as a POJO to hold information 
 * about battery's charging/discharging cycle
 */
public class BatteryCycle implements Serializable
{
	private StateOfCharge stateOfCharge = StateOfCharge.UNDEFINED;
	private Timestamp startTime;
	private Timestamp endTime;
	private double cycleDuration; // min
	private double starterRunDuration; // sec
	private double maxDischarge; // A
	private double temperature; // deg C
	private double batteryResistance; // Ohm
	private double computedCA; // Amperes
	private double coulombsReleased; // Q
	
	public static BatteryCycle createDummyCycle()
	{
		BatteryCycle dummy = new BatteryCycle();
		dummy.stateOfCharge = Utilities.randomEnum(StateOfCharge.class);
		dummy.startTime = Utilities.generateTimestamp();
		dummy.endTime = Utilities.generateTimestamp();
		int duration = Utilities.getRandomInteger(10, 150) * 60 *1000;
		dummy.endTime.setTime(dummy.startTime.getTime() + duration);			
		dummy.cycleDuration = (dummy.endTime.getTime() - dummy.startTime.getTime()) * 1000 * 60;
		dummy.starterRunDuration = Utilities.getRandomDouble(0.2, 2.0);
		dummy.temperature = Utilities.getRandomDouble(10, 40);
		dummy.maxDischarge = Utilities.getRandomDouble(50, 150);
		dummy.batteryResistance = Utilities.getRandomDouble(0.01, 0.08);
		dummy.computedCA = Utilities.getRandomDouble(0.2, 0.8);
		dummy.coulombsReleased = Utilities.getRandomDouble(2.0, 5.0);		
			
		return dummy;
	}

	public StateOfCharge getStateOfCharge()
	{
		return stateOfCharge;
	}

	public void setStateOfCharge(StateOfCharge stateOfCharge)
	{
		this.stateOfCharge = stateOfCharge;
	}

	public Timestamp getStartTime()
	{
		return startTime;
	}

	public void setStartTime(Timestamp startTime)
	{
		this.startTime = startTime;
	}

	public Timestamp getEndTime()
	{
		return endTime;
	}

	public void setEndTime(Timestamp endTime)
	{
		this.endTime = endTime;
	}

	public double getCycleDuration()
	{
		return cycleDuration;
	}

	public void setCycleDuration(double cycleDuration)
	{
		this.cycleDuration = cycleDuration;
	}

	public double getStarterRunDuration()
	{
		return starterRunDuration;
	}

	public void setStarterRunDuration(double starterRunDuration)
	{
		this.starterRunDuration = starterRunDuration;
	}

	public double getMaxDischarge()
	{
		return maxDischarge;
	}

	public void setMaxDischarge(double maxDischarge)
	{
		this.maxDischarge = maxDischarge;
	}

	public double getTemperature()
	{
		return temperature;
	}

	public void setTemperature(double temperature)
	{
		this.temperature = temperature;
	}

	public double getBatteryResistance()
	{
		return batteryResistance;
	}

	public void setBatteryResistance(double batteryResistance)
	{
		this.batteryResistance = batteryResistance;
	}

	public double getComputedCA()
	{
		return computedCA;
	}

	public void setComputedCA(double computedCA)
	{
		this.computedCA = computedCA;
	}

	public double getCoulombsReleased()
	{
		return coulombsReleased;
	}

	public void setCoulombsReleased(double coulombsReleased)
	{
		this.coulombsReleased = coulombsReleased;
	}

	@Override
	public String toString()
	{
		return "BatteryCycle [stateOfCharge=" + stateOfCharge + ", startTime=" + startTime + ", endTime=" + endTime + ", cycleDuration=" + cycleDuration + ", starterRunDuration=" + starterRunDuration + ", maxDischarge=" + maxDischarge + ", temperature=" + temperature + ", batteryResistance="
				+ batteryResistance + ", computedCA=" + computedCA + ", coulombsReleased=" + coulombsReleased + "]";
	}
	
}
