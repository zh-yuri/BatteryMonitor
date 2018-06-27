/*
 * 
 * @author  Yuri Zharchuk
 * 
 */
package com.daimler.batterymonitor.model;

/*
 * Initialized enum. 
 * Self explanatory purpose.
 * 
 */
public enum StateOfCharge
{	
	UNDEFINED (-1),
	RESTING (0),
	CHARGING (1),
	DISCHARGING (2);
	
	private int value;
	
	private StateOfCharge(int value) 
	{ 
		this.value = value; 
	}
};
