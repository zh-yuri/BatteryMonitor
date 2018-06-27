/*
 * 
 * @author  Yuri Zharchuk
 * 
 */
package com.daimler.batterymonitor.model;

import java.io.Serializable;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import com.daimler.batterymonitor.utilities.Utilities;

/*
 * This is  POJO class which is used to expose calculated 
 * battery statistics to Angular thin client application.
 * 
 */

public class BatteryStats implements Serializable
{
	private int chargeOut; //Q
	private int chargeIn; //Q
	private boolean fullyRecharged;
	private int rechargingDuration; //minutes
	private int estimatedLife; //days	
	private List<BatteryCycle> batteryCycles;
		
	//TODO: more stats TBD.
	// some stats can be dropped, some new stats will be added.
	
	
	// for testing only
	// I'm not using standard getters/setters here
	public static BatteryStats createDummyBatteryStats()
	{
		BatteryStats dummy = new BatteryStats();	
		dummy.batteryCycles = new ArrayList<BatteryCycle>();
		int size = Utilities.getRandomInteger(3, 10);
		
		for (int i = 0; i < size; i++)
			dummy.batteryCycles.add(BatteryCycle.createDummyCycle());	
		
		dummy.chargeOut = Utilities.getRandomInteger(1000, 2000);
		dummy.chargeIn = Utilities.getRandomInteger(1000, 2000);
		dummy.fullyRecharged = Utilities.getRandomBoolean();
		dummy.rechargingDuration = Utilities.getRandomInteger(1000, 2000);
		dummy.estimatedLife = Utilities.getRandomInteger(50, 300);	
		
		return dummy;
	}	
	
	public int getChargeOut()
	{
		return chargeOut;
	}

	public void setChargeOut(int chargeOut)
	{
		this.chargeOut = chargeOut;
	}

	public int getChargeIn()
	{
		return chargeIn;
	}

	public void setChargeIn(int chargeIn)
	{
		this.chargeIn = chargeIn;
	}

	public boolean isFullyRecharged()
	{
		return fullyRecharged;
	}

	public void setFullyRecharged(boolean fullyRecharged)
	{
		this.fullyRecharged = fullyRecharged;
	}

	public int getRechargingDuration()
	{
		return rechargingDuration;
	}

	public void setRechargingDuration(int rechargingDuration)
	{
		this.rechargingDuration = rechargingDuration;
	}

	public int getEstimatedLife()
	{
		return estimatedLife;
	}

	public void setEstimatedLife(int estimatedLife)
	{
		this.estimatedLife = estimatedLife;
	}

	public List<BatteryCycle> getBatteryCycles()
	{
		return batteryCycles;
	}

	public void setBatteryCycles(List<BatteryCycle> batteryCycles)
	{
		this.batteryCycles = batteryCycles;
	}

	@Override
	public String toString()
	{
		return "BatteryStats [chargeOut=" + chargeOut + ", chargeIn=" + chargeIn + ", fullyRecharged=" + fullyRecharged + ", rechargingDuration=" + rechargingDuration + ", estimatedLife=" + estimatedLife + ", batteryCycles=" + batteryCycles + "]";
	}
}
