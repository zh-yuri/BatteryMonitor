/*
 * 
 * @author  Yuri Zharchuk
 * 
 */

package com.daimler.batterymonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/*
 * This is an entry point for the application.
 * Some modifications in this class along with configuration in POM file are required 
 * to build WAR file for deployment on Tomcat web server.
 *  
 */
@SpringBootApplication
public class BatteryMonitorApplication extends SpringBootServletInitializer implements CommandLineRunner
{
	private final Logger log = LogManager.getLogger(BatteryMonitorApplication.class);
	
	//YZ this comes from .properties file
	@Value("${application.name}")
	private String applicationName;
	
	public static void main(String[] args)
	{
		SpringApplication.run(BatteryMonitorApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception
	{
		//YZ just for tracing, to indicate that application started successully
		log.info("applicationName: {}", applicationName);			
	}
	
	@Override //YZ this method added for WAR deployment. See POM file section 'build'.
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(BatteryMonitorApplication.class);
	}
}
