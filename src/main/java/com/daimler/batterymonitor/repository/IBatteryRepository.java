/*
 * 
 * @author  Yuri Zharchuk
 * 
 */

package com.daimler.batterymonitor.repository;

import java.util.List;

import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.daimler.batterymonitor.model.Battery;

/*
 * Create simple queries.
 * Spring Data JPA focuses on using JPA to store and retrieve data in a relational database. 
 * Its most compelling feature is the ability to create repository implementations automatically, 
 * at runtime, from a repository interface CrudRepository
 * 
 */
public interface IBatteryRepository extends CrudRepository<Battery, Long>
{
	@Query(value="SELECT DISTINCT a.vehicle_model FROM Battery a WHERE a.vehicle_model > 0 order by a.vehicle_model", nativeQuery = true)		
	List<Integer> findVehicleModels();
	List<Battery> findByVehicle(Integer vehicle);	
}
