/*
 * 
 * @author  Yuri Zharchuk
 * 
 */
package com.daimler.batterymonitor.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.daimler.batterymonitor.model.Battery;

/*
 * Let's define a simple entity.
 * In this example, we store Battery objects, annotated as a JPA entity.
 * The Battery class is annotated with @Entity, indicating that it is a JPA entity. 
 * @Table annotation means that it is assumed that this entity will be mapped to a table named Battery.
 * The Battery's id property is annotated with @Id so that JPA will recognize it as the object’s ID. 
 * Id is added to DB table as artificial Primary Key needed for Hibernate (that's the only way it works)
 * The id property is also annotated with @GeneratedValue to indicate that the ID should be generated automatically.
 * All the rest properties mapped to columns that share the same name as the properties themselves.
 * The convenient toString() method will print out the battery's properties.
 */
@Entity
@Table(name = "battery")
public class Battery implements Serializable
{
	private static final long serialVersionUID = -3009193861742241606L;
	private final static Logger log = LogManager.getLogger(Battery.class);
	
	@Column(name = "dtime")
	private Date dtime;
	
	@Column(name = "misoperation")
	private int misoperation; 
	
	@Column(name = "motor_current_state")
	private int motor_current_state; 
	
	@Column(name = "brake")
	private int brake; 
	
	@Column(name = "motor_temperature")
	private int motor_temperature; 
	
	@Column(name = "system_fault_light")
	private int system_fault_light; 
	
	@Column(name = "braking_system_fault_display")
	private int braking_system_fault_display; 
	
	@Column(name = "accelerator_opening")
	private float accelerator_opening;
	
	@Column(name = "high_voltage_detection_complete_flag")
	private int high_voltage_detection_complete_flag; 
	
	@Column(name = "low_voltage_power_off_request_flag")
	private int low_voltage_power_off_request_flag; 
	
	@Column(name = "current_motor_speed")
	private int current_motor_speed; 
	
	@Column(name = "current_motor_torque")
	private float current_motor_torque;
	
	@Column(name = "dc_bus_voltage")
	private float dc_bus_voltage;
	
	@Column(name = "dc_bus_current")
	private float dc_bus_current;
	
	@Column(name = "motor_phase_current_effective_value")
	private float motor_phase_current_effective_value;
	
	@Column(name = "motor_maximum_drive_torque")
	private float motor_maximum_drive_torque;
	
	@Column(name = "motorr_maximum_braking_torque")
	private float motorr_maximum_braking_torque;
	
	@Column(name = "speed_signal")
	private float speed_signal;
	
	@Column(name = "active_drive")
	private int active_drive; 
	
	@Column(name = "drive_motor_output_power_mcu_part_number")
	private float drive_motor_output_power_mcu_part_number;
	
	@Column(name = "accelerator_pedal_voltage")
	private float accelerator_pedal_voltage;
	
	@Column(name = "gear_switch_a_voltage")
	private float gear_switch_a_voltage;
	
	@Column(name = "gear_switch_b_voltage")
	private float gear_switch_b_voltage;
	
	@Column(name = "gear_switch_c_voltage")
	private float gear_switch_c_voltage;
	
	@Column(name = "gear_switch_d_voltage")
	private float gear_switch_d_voltage;
	
	@Column(name = "total_number_of_drive_motors")
	private int total_number_of_drive_motors; 
	
	@Column(name = "drive_motor_serial_number")
	private int drive_motor_serial_number; 
	
	@Column(name = "total_number_of_drive_motor_failures")
	private int total_number_of_drive_motor_failures; 
	
	@Column(name = "battery_voltage")
	private float battery_voltage;
	
	@Column(name = "slow_charge_wakeup_signal")
	private int slow_charge_wakeup_signal; 
	
	@Column(name = "vehicle_model")
	private int vehicle; 
	
	@Column(name = "power_battery_positive_relay_current_control_command_status")
	private int power_battery_positive_relay_current_control_command_status; 
	
	@Column(name = "power_battery_precharge_relay_current_control_command_status")
	private int power_battery_precharge_relay_current_control_command_status; 
	
	@Column(name = "soc_state_of_charge")
	private float soc_state_of_charge;
	
	@Column(name = "current_status_allows_maximum_feedback_power")
	private float current_status_allows_maximum_feedback_power;
	
	@Column(name = "current_status_allows_maximum_discharge_power")
	private float current_status_allows_maximum_discharge_power;
	
	@Column(name = "bms_self_test_counter")
	private int bms_self_test_counter; 
	
	@Column(name = "power_battery_internal_total_voltage_v1")
	private float power_battery_internal_total_voltage_v1;
	
	@Column(name = "power_battery_charge_discharge_current")
	private float power_battery_charge_discharge_current;
	
	@Column(name = "power_battery_external_total_voltage_v2")
	private float power_battery_external_total_voltage_v2;
	
	@Column(name = "power_battery_load_voltage_v3")
	private float power_battery_load_voltage_v3;
	
	@Column(name = "single_cell_core_voltage")
	private float single_cell_core_voltage;
	
	@Column(name = "single_cell_minimum_voltage")
	private float single_cell_minimum_voltage;
	
	@Column(name = "power_battery_positive_to_gnd_insulation_resistance")
	private int power_battery_positive_to_gnd_insulation_resistance; 
	
	@Column(name = "power_battery_negative_resistance_to_gnd_insulation_resistance")
	private int power_battery_negative_resistance_to_gnd_insulation_resistance; 
	
	@Column(name = "single_cell_temperature")
	private int single_cell_temperature; 
	
	@Column(name = "single_cell_minimum_temperature")
	private int single_cell_minimum_temperature; 
	
	@Column(name = "power_battery_available_energy")
	private float power_battery_available_energy;
	
	@Column(name = "power_battery_available_capacity")
	private float power_battery_available_capacity;
	
	@Column(name = "effective_cell_voltage")
	private int effective_cell_voltage; 
	
	@Column(name = "effective_temperature_collection_points")
	private int effective_temperature_collection_points; 
	
	@Column(name = "dcdc_current_status")
	private int dcdc_current_status; 
	
	@Column(name = "slow_charge_cc_voltage")
	private float slow_charge_cc_voltage;
	
	@Column(name = "low_battery_alert")
	private int low_battery_alert; 
	
	@Column(name = "driving_range")
	private float driving_range;
	
	@Column(name = "mileage_value")
	private float mileage_value;
	
	@Column(name = "prohibited_high_voltage_power_on_flag")
	private int prohibited_high_voltage_power_on_flag; 
	
	@Column(name = "vehicle_bootloader_flag")
	private int vehicle_bootloader_flag; 
	
	@Column(name = "on_board_charger_output_voltage_instruction")
	private int on_board_charger_output_voltage_instruction; 
	
	@Column(name = "car_charger_output_current_instruction")
	private float car_charger_output_current_instruction;
	
	@Column(name = "car_charger_work_instruction")
	private int car_charger_work_instruction; 
	
	@Column(name = "car_charger_network_status_control_command")
	private int car_charger_network_status_control_command; 
	
	@Column(name = "charging")
	private int charging; 
	
	@Column(name = "power_battery_heater_relay_instruction")
	private int power_battery_heater_relay_instruction; 
	
	@Column(name = "high_voltage_power_down_request_vcu_charge_self_test_counter")
	private int high_voltage_power_down_request_vcu_charge_self_test_counter; 
	
	@Column(name = "high_voltage_power_down_request_charging")
	private int high_voltage_power_down_request_charging; 
	
	@Column(name = "remote_refresh_mode_enable_command")
	private int remote_refresh_mode_enable_command; 
	
	@Column(name = "system_fault_light_bms")
	private int system_fault_light_bms; 
	
	@Column(name = "power_battery_system_fault_indicator_vcu")
	private int power_battery_system_fault_indicator_vcu; 
	
	@Column(name = "troubleshooting_level")
	private int troubleshooting_level;
	
	@Column(name = "collision_signal_status")
	private int collision_signal_status; 
	
	@Column(name = "operating_mode")
	private int operating_mode; 
	
	@Column(name = "battery_pack1_monomer_minimum_number")
	private int battery_pack1_monomer_minimum_number; 
	
	@Column(name = "battery_pack1_monomer_maximum_number")
	private int battery_pack1_monomer_maximum_number; 
	
	@Column(name = "battery_pack1_maximum_temperature")
	private int battery_pack1_maximum_temperature; 
	
	@Column(name = "battery_pack1_minimum_temperature")
	private int battery_pack1_minimum_temperature; 
	
	@Column(name = "temperature_sensor1")
	private int temperature_sensor1; 
	
	@Column(name = "temperature_sensor2")
	private int temperature_sensor2; 
	
	@Column(name = "temperature_sensor3")
	private int temperature_sensor3; 
	
	@Column(name = "temperature_sensor4")
	private int temperature_sensor4; 
	
	@Column(name = "temperature_sensor5")
	private int temperature_sensor5; 
	
	@Column(name = "temperature_sensor6")
	private int temperature_sensor6; 
	
	@Column(name = "temperature_sensor7")
	private int temperature_sensor7; 
	
	@Column(name = "temperature_sensor8")
	private int temperature_sensor8; 
	
	@Column(name = "temperature_sensor9")
	private int temperature_sensor9; 
	
	@Column(name = "total_milage")
	private int total_milage; 
	
	@Column(name = "current_status_of_car_charger")
	private int current_status_of_car_charger; 
	
	@Column(name = "car_charge_wakeup_output_signal_status")
	private int car_charge_wakeup_output_signal_status; 
	
	@Column(name = "slow_charge_gun_connection_status")
	private int slow_charge_gun_connection_status; 
	
	@Column(name = "charging_mode")
	private int charging_mode; 
	
	@Column(name = "power_supply_equipment_status")
	private int power_supply_equipment_status; 
	
	@Column(name = "charger_output_current")
	private float charger_output_current;
	
	@Column(name = "charger_output_voltage")
	private float charger_output_voltage;
	
	@Column(name = "speed")
	private float speed;
	
	@Column(name = "power_battery_pack_number")
	private int power_battery_pack_number; 
	
	@Column(name = "power_battery_pack_number_length")
	private int power_battery_pack_number_length; 
	
	@Column(name = "power_battery_subsystem_number")
	private int power_battery_subsystem_number; 
	
	@Column(name = "total_number_of_battery_cells")
	private int total_number_of_battery_cells; 
	
	@Column(name = "power_battery_temperature_point_total")
	private int power_battery_temperature_point_total; 
	
	@Column(name = "total_battery_power_failure")
	private int total_battery_power_failure; 
	
	@Column(name = "cell_voltage_nr1")
	private float cell_voltage_nr1;
	
	@Column(name = "cell_voltage_nr2")
	private float cell_voltage_nr2;
	
	@Column(name = "cell_voltage_nr3")
	private float cell_voltage_nr3;
	
	@Column(name = "cell_voltage_nr4")
	private float cell_voltage_nr4;
	
	@Column(name = "cell_voltage_nr_5")
	private float cell_voltage_nr_5;
	
	@Column(name = "cell_voltage_nr6")
	private float cell_voltage_nr6;
	
	@Column(name = "cell_voltage_nr7")
	private float cell_voltage_nr7;
	
	@Column(name = "cell_voltage_nr8")
	private float cell_voltage_nr8;
	
	@Column(name = "cell_voltage_nr9")
	private float cell_voltage_nr9;
	
	@Column(name = "cell_voltage_nr10")
	private float cell_voltage_nr10;
	
	@Column(name = "cell_voltage_nr11")
	private float cell_voltage_nr11;
	
	@Column(name = "cell_voltage_nr12")
	private float cell_voltage_nr12;
	
	@Column(name = "cell_voltage_nr13")
	private float cell_voltage_nr13;
	
	@Column(name = "cell_voltage_nr14")
	private float cell_voltage_nr14;
	
	@Column(name = "cell_voltage_nr15")
	private float cell_voltage_nr15;
	
	@Column(name = "cell_voltage_nr16")
	private float cell_voltage_nr16;
	
	@Column(name = "cell_voltage_nr17")
	private float cell_voltage_nr17;
	
	@Column(name = "cell_voltage_nr18")
	private float cell_voltage_nr18;
	
	@Column(name = "cell_voltage_nr19")
	private float cell_voltage_nr19;
	
	@Column(name = "cell_voltage_nr20")
	private float cell_voltage_nr20;
	
	@Column(name = "cell_voltage_nr21")
	private float cell_voltage_nr21;
	
	@Column(name = "cell_voltage_nr22")
	private float cell_voltage_nr22;
	
	@Column(name = "cell_voltage_nr23")
	private float cell_voltage_nr23;
	
	@Column(name = "cell_voltage_nr24")
	private float cell_voltage_nr24;
	
	@Column(name = "cell_voltage_nr25")
	private float cell_voltage_nr25;
	
	@Column(name = "cell_voltage_nr26")
	private float cell_voltage_nr26;
	
	@Column(name = "cell_voltage_nr27")
	private float cell_voltage_nr27;
	
	@Column(name = "cell_voltage_nr28")
	private float cell_voltage_nr28;
	
	@Column(name = "cell_voltage_nr29")
	private float cell_voltage_nr29;
	
	@Column(name = "cell_voltage_nr30")
	private float cell_voltage_nr30;
	
	@Column(name = "cell_voltage_nr31")
	private float cell_voltage_nr31;
	
	@Column(name = "maximum_unit_voltage_number")
	private int maximum_unit_voltage_number; 
	
	@Column(name = "maximum_temperature_number")
	private int maximum_temperature_number; 
	
	@Column(name = "lowest_temperature_number")
	private int lowest_temperature_number; 
	
	@Column(name = "lowest_cell_voltage_number")
	private int lowest_cell_voltage_number; 
	
	@Column(name = "maximum_unit_voltage_package_number")
	private int maximum_unit_voltage_package_number;
	
	@Column(name = "maximum_temperature_package_number")
	private int maximum_temperature_package_number;
	
	@Column(name = "minimum_temperature_package_number")
	private int minimum_temperature_package_number; 
	
	@Column(name = "lowest_monomer_voltage_package_number")
	private int lowest_monomer_voltage_package_number;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	

	// this is just a utility method for debugging
	public static void printDataCollection(List<Battery> collection)
	{
		log.debug("");
		log.debug("Collection.Size()={}", collection.size());
		for (int i = 0; i < collection.size(); i++)
			log.debug("{}. {}", i, collection.get(i).toString());
		
		log.debug("");
	}
	
	//Default constructor
	public Battery() {};
	
	// all fields constructor
	public Battery(Date time, int misoperation, int motor_current_state, int brake, int motor_temperature, int system_fault_light, int braking_system_fault_display, float accelerator_opening, int high_voltage_detection_complete_flag, int low_voltage_power_off_request_flag, int current_motor_speed,
			float current_motor_torque, float dc_bus_voltage, float dc_bus_current, float motor_phase_current_effective_value, float motor_maximum_drive_torque, float motorr_maximum_braking_torque, float speed_signal, int active_drive, float drive_motor_output_power_mcu_part_number,
			float accelerator_pedal_voltage, float gear_switch_a_voltage, float gear_switch_b_voltage, float gear_switch_c_voltage, float gear_switch_d_voltage, int total_number_of_drive_motors, int drive_motor_serial_number, int total_number_of_drive_motor_failures, float battery_voltage,
			int slow_charge_wakeup_signal, int vehicle_model, int power_battery_positive_relay_current_control_command_status, int power_battery_precharge_relay_current_control_command_status, float soc_state_of_charge, float current_status_allows_maximum_feedback_power,
			float current_status_allows_maximum_discharge_power, int bms_self_test_counter, float power_battery_internal_total_voltage_v1, float power_battery_charge_discharge_current, float power_battery_external_total_voltage_v2, float power_battery_load_voltage_v3, float single_cell_core_voltage,
			float single_cell_minimum_voltage, int power_battery_positive_to_gnd_insulation_resistance, int power_battery_negative_resistance_to_gnd_insulation_resistance, int single_cell_temperature, int single_cell_minimum_temperature, float power_battery_available_energy,
			float power_battery_available_capacity, int effective_cell_voltage, int effective_temperature_collection_points, int dcdc_current_status, float slow_charge_cc_voltage, int low_battery_alert, float driving_range, float mileage_value, int prohibited_high_voltage_power_on_flag,
			int vehicle_bootloader_flag, int on_board_charger_output_voltage_instruction, float car_charger_output_current_instruction, int car_charger_work_instruction, int car_charger_network_status_control_command, int charging, int power_battery_heater_relay_instruction,
			int high_voltage_power_down_request_vcu_charge_self_test_counter, int high_voltage_power_down_request_charging, int remote_refresh_mode_enable_command, int system_fault_light_bms, int power_battery_system_fault_indicator_vcu, int troubleshooting_level, int collision_signal_status,
			int operating_mode, int battery_pack1_monomer_minimum_number, int battery_pack1_monomer_maximum_number, int battery_pack1_maximum_temperature, int battery_pack1_minimum_temperature, int temperature_sensor1, int temperature_sensor2, int temperature_sensor3, int temperature_sensor4,
			int temperature_sensor5, int temperature_sensor6, int temperature_sensor7, int temperature_sensor8, int temperature_sensor9, int total_milage, int current_status_of_car_charger, int car_charge_wakeup_output_signal_status, int slow_charge_gun_connection_status, int charging_mode,
			int power_supply_equipment_status, float charger_output_current, float charger_output_voltage, float speed, int power_battery_pack_number, int power_battery_pack_number_length, int power_battery_subsystem_number, int total_number_of_battery_cells,
			int power_battery_temperature_point_total, int total_battery_power_failure, float cell_voltage_nr1, float cell_voltage_nr2, float cell_voltage_nr3, float cell_voltage_nr4, float cell_voltage_nr_5, float cell_voltage_nr6, float cell_voltage_nr7, float cell_voltage_nr8,
			float cell_voltage_nr9, float cell_voltage_nr10, float cell_voltage_nr11, float cell_voltage_nr12, float cell_voltage_nr13, float cell_voltage_nr14, float cell_voltage_nr15, float cell_voltage_nr16, float cell_voltage_nr17, float cell_voltage_nr18, float cell_voltage_nr19,
			float cell_voltage_nr20, float cell_voltage_nr21, float cell_voltage_nr22, float cell_voltage_nr23, float cell_voltage_nr24, float cell_voltage_nr25, float cell_voltage_nr26, float cell_voltage_nr27, float cell_voltage_nr28, float cell_voltage_nr29, float cell_voltage_nr30,
			float cell_voltage_nr31, int maximum_unit_voltage_number, int maximum_temperature_number, int lowest_temperature_number, int lowest_cell_voltage_number, int maximum_unit_voltage_package_number, int maximum_temperature_package_number, int minimum_temperature_package_number,
			int lowest_monomer_voltage_package_number)
	{
		this.dtime = time;
		this.misoperation = misoperation;
		this.motor_current_state = motor_current_state;
		this.brake = brake;
		this.motor_temperature = motor_temperature;
		this.system_fault_light = system_fault_light;
		this.braking_system_fault_display = braking_system_fault_display;
		this.accelerator_opening = accelerator_opening;
		this.high_voltage_detection_complete_flag = high_voltage_detection_complete_flag;
		this.low_voltage_power_off_request_flag = low_voltage_power_off_request_flag;
		this.current_motor_speed = current_motor_speed;
		this.current_motor_torque = current_motor_torque;
		this.dc_bus_voltage = dc_bus_voltage;
		this.dc_bus_current = dc_bus_current;
		this.motor_phase_current_effective_value = motor_phase_current_effective_value;
		this.motor_maximum_drive_torque = motor_maximum_drive_torque;
		this.motorr_maximum_braking_torque = motorr_maximum_braking_torque;
		this.speed_signal = speed_signal;
		this.active_drive = active_drive;
		this.drive_motor_output_power_mcu_part_number = drive_motor_output_power_mcu_part_number;
		this.accelerator_pedal_voltage = accelerator_pedal_voltage;
		this.gear_switch_a_voltage = gear_switch_a_voltage;
		this.gear_switch_b_voltage = gear_switch_b_voltage;
		this.gear_switch_c_voltage = gear_switch_c_voltage;
		this.gear_switch_d_voltage = gear_switch_d_voltage;
		this.total_number_of_drive_motors = total_number_of_drive_motors;
		this.drive_motor_serial_number = drive_motor_serial_number;
		this.total_number_of_drive_motor_failures = total_number_of_drive_motor_failures;
		this.battery_voltage = battery_voltage;
		this.slow_charge_wakeup_signal = slow_charge_wakeup_signal;
		this.vehicle = vehicle_model;
		this.power_battery_positive_relay_current_control_command_status = power_battery_positive_relay_current_control_command_status;
		this.power_battery_precharge_relay_current_control_command_status = power_battery_precharge_relay_current_control_command_status;
		this.soc_state_of_charge = soc_state_of_charge;
		this.current_status_allows_maximum_feedback_power = current_status_allows_maximum_feedback_power;
		this.current_status_allows_maximum_discharge_power = current_status_allows_maximum_discharge_power;
		this.bms_self_test_counter = bms_self_test_counter;
		this.power_battery_internal_total_voltage_v1 = power_battery_internal_total_voltage_v1;
		this.power_battery_charge_discharge_current = power_battery_charge_discharge_current;
		this.power_battery_external_total_voltage_v2 = power_battery_external_total_voltage_v2;
		this.power_battery_load_voltage_v3 = power_battery_load_voltage_v3;
		this.single_cell_core_voltage = single_cell_core_voltage;
		this.single_cell_minimum_voltage = single_cell_minimum_voltage;
		this.power_battery_positive_to_gnd_insulation_resistance = power_battery_positive_to_gnd_insulation_resistance;
		this.power_battery_negative_resistance_to_gnd_insulation_resistance = power_battery_negative_resistance_to_gnd_insulation_resistance;
		this.single_cell_temperature = single_cell_temperature;
		this.single_cell_minimum_temperature = single_cell_minimum_temperature;
		this.power_battery_available_energy = power_battery_available_energy;
		this.power_battery_available_capacity = power_battery_available_capacity;
		this.effective_cell_voltage = effective_cell_voltage;
		this.effective_temperature_collection_points = effective_temperature_collection_points;
		this.dcdc_current_status = dcdc_current_status;
		this.slow_charge_cc_voltage = slow_charge_cc_voltage;
		this.low_battery_alert = low_battery_alert;
		this.driving_range = driving_range;
		this.mileage_value = mileage_value;
		this.prohibited_high_voltage_power_on_flag = prohibited_high_voltage_power_on_flag;
		this.vehicle_bootloader_flag = vehicle_bootloader_flag;
		this.on_board_charger_output_voltage_instruction = on_board_charger_output_voltage_instruction;
		this.car_charger_output_current_instruction = car_charger_output_current_instruction;
		this.car_charger_work_instruction = car_charger_work_instruction;
		this.car_charger_network_status_control_command = car_charger_network_status_control_command;
		this.charging = charging;
		this.power_battery_heater_relay_instruction = power_battery_heater_relay_instruction;
		this.high_voltage_power_down_request_vcu_charge_self_test_counter = high_voltage_power_down_request_vcu_charge_self_test_counter;
		this.high_voltage_power_down_request_charging = high_voltage_power_down_request_charging;
		this.remote_refresh_mode_enable_command = remote_refresh_mode_enable_command;
		this.system_fault_light_bms = system_fault_light_bms;
		this.power_battery_system_fault_indicator_vcu = power_battery_system_fault_indicator_vcu;
		this.troubleshooting_level = troubleshooting_level;
		this.collision_signal_status = collision_signal_status;
		this.operating_mode = operating_mode;
		this.battery_pack1_monomer_minimum_number = battery_pack1_monomer_minimum_number;
		this.battery_pack1_monomer_maximum_number = battery_pack1_monomer_maximum_number;
		this.battery_pack1_maximum_temperature = battery_pack1_maximum_temperature;
		this.battery_pack1_minimum_temperature = battery_pack1_minimum_temperature;
		this.temperature_sensor1 = temperature_sensor1;
		this.temperature_sensor2 = temperature_sensor2;
		this.temperature_sensor3 = temperature_sensor3;
		this.temperature_sensor4 = temperature_sensor4;
		this.temperature_sensor5 = temperature_sensor5;
		this.temperature_sensor6 = temperature_sensor6;
		this.temperature_sensor7 = temperature_sensor7;
		this.temperature_sensor8 = temperature_sensor8;
		this.temperature_sensor9 = temperature_sensor9;
		this.total_milage = total_milage;
		this.current_status_of_car_charger = current_status_of_car_charger;
		this.car_charge_wakeup_output_signal_status = car_charge_wakeup_output_signal_status;
		this.slow_charge_gun_connection_status = slow_charge_gun_connection_status;
		this.charging_mode = charging_mode;
		this.power_supply_equipment_status = power_supply_equipment_status;
		this.charger_output_current = charger_output_current;
		this.charger_output_voltage = charger_output_voltage;
		this.speed = speed;
		this.power_battery_pack_number = power_battery_pack_number;
		this.power_battery_pack_number_length = power_battery_pack_number_length;
		this.power_battery_subsystem_number = power_battery_subsystem_number;
		this.total_number_of_battery_cells = total_number_of_battery_cells;
		this.power_battery_temperature_point_total = power_battery_temperature_point_total;
		this.total_battery_power_failure = total_battery_power_failure;
		this.cell_voltage_nr1 = cell_voltage_nr1;
		this.cell_voltage_nr2 = cell_voltage_nr2;
		this.cell_voltage_nr3 = cell_voltage_nr3;
		this.cell_voltage_nr4 = cell_voltage_nr4;
		this.cell_voltage_nr_5 = cell_voltage_nr_5;
		this.cell_voltage_nr6 = cell_voltage_nr6;
		this.cell_voltage_nr7 = cell_voltage_nr7;
		this.cell_voltage_nr8 = cell_voltage_nr8;
		this.cell_voltage_nr9 = cell_voltage_nr9;
		this.cell_voltage_nr10 = cell_voltage_nr10;
		this.cell_voltage_nr11 = cell_voltage_nr11;
		this.cell_voltage_nr12 = cell_voltage_nr12;
		this.cell_voltage_nr13 = cell_voltage_nr13;
		this.cell_voltage_nr14 = cell_voltage_nr14;
		this.cell_voltage_nr15 = cell_voltage_nr15;
		this.cell_voltage_nr16 = cell_voltage_nr16;
		this.cell_voltage_nr17 = cell_voltage_nr17;
		this.cell_voltage_nr18 = cell_voltage_nr18;
		this.cell_voltage_nr19 = cell_voltage_nr19;
		this.cell_voltage_nr20 = cell_voltage_nr20;
		this.cell_voltage_nr21 = cell_voltage_nr21;
		this.cell_voltage_nr22 = cell_voltage_nr22;
		this.cell_voltage_nr23 = cell_voltage_nr23;
		this.cell_voltage_nr24 = cell_voltage_nr24;
		this.cell_voltage_nr25 = cell_voltage_nr25;
		this.cell_voltage_nr26 = cell_voltage_nr26;
		this.cell_voltage_nr27 = cell_voltage_nr27;
		this.cell_voltage_nr28 = cell_voltage_nr28;
		this.cell_voltage_nr29 = cell_voltage_nr29;
		this.cell_voltage_nr30 = cell_voltage_nr30;
		this.cell_voltage_nr31 = cell_voltage_nr31;
		this.maximum_unit_voltage_number = maximum_unit_voltage_number;
		this.maximum_temperature_number = maximum_temperature_number;
		this.lowest_temperature_number = lowest_temperature_number;
		this.lowest_cell_voltage_number = lowest_cell_voltage_number;
		this.maximum_unit_voltage_package_number = maximum_unit_voltage_package_number;
		this.maximum_temperature_package_number = maximum_temperature_package_number;
		this.minimum_temperature_package_number = minimum_temperature_package_number;
		this.lowest_monomer_voltage_package_number = lowest_monomer_voltage_package_number;
	}



	@Override
	public String toString()
	{
		return "Battery [time=" + dtime + ", misoperation=" + misoperation + ", motor_current_state=" + motor_current_state + ", brake=" + brake + ", motor_temperature=" + motor_temperature + ", system_fault_light=" + system_fault_light + ", braking_system_fault_display="
				+ braking_system_fault_display + ", accelerator_opening=" + accelerator_opening + ", high_voltage_detection_complete_flag=" + high_voltage_detection_complete_flag + ", low_voltage_power_off_request_flag=" + low_voltage_power_off_request_flag + ", current_motor_speed="
				+ current_motor_speed + ", current_motor_torque=" + current_motor_torque + ", dc_bus_voltage=" + dc_bus_voltage + ", dc_bus_current=" + dc_bus_current + ", motor_phase_current_effective_value=" + motor_phase_current_effective_value + ", motor_maximum_drive_torque="
				+ motor_maximum_drive_torque + ", motorr_maximum_braking_torque=" + motorr_maximum_braking_torque + ", speed_signal=" + speed_signal + ", active_drive=" + active_drive + ", drive_motor_output_power_mcu_part_number=" + drive_motor_output_power_mcu_part_number
				+ ", accelerator_pedal_voltage=" + accelerator_pedal_voltage + ", gear_switch_a_voltage=" + gear_switch_a_voltage + ", gear_switch_b_voltage=" + gear_switch_b_voltage + ", gear_switch_c_voltage=" + gear_switch_c_voltage + ", gear_switch_d_voltage=" + gear_switch_d_voltage
				+ ", total_number_of_drive_motors=" + total_number_of_drive_motors + ", drive_motor_serial_number=" + drive_motor_serial_number + ", total_number_of_drive_motor_failures=" + total_number_of_drive_motor_failures + ", battery_voltage=" + battery_voltage + ", slow_charge_wakeup_signal="
				+ slow_charge_wakeup_signal + ", vehicle=" + vehicle + ", power_battery_positive_relay_current_control_command_status=" + power_battery_positive_relay_current_control_command_status + ", power_battery_precharge_relay_current_control_command_status="
				+ power_battery_precharge_relay_current_control_command_status + ", soc_state_of_charge=" + soc_state_of_charge + ", current_status_allows_maximum_feedback_power=" + current_status_allows_maximum_feedback_power + ", current_status_allows_maximum_discharge_power="
				+ current_status_allows_maximum_discharge_power + ", bms_self_test_counter=" + bms_self_test_counter + ", power_battery_internal_total_voltage_v1=" + power_battery_internal_total_voltage_v1 + ", power_battery_charge_discharge_current=" + power_battery_charge_discharge_current
				+ ", power_battery_external_total_voltage_v2=" + power_battery_external_total_voltage_v2 + ", power_battery_load_voltage_v3=" + power_battery_load_voltage_v3 + ", single_cell_core_voltage=" + single_cell_core_voltage + ", single_cell_minimum_voltage=" + single_cell_minimum_voltage
				+ ", power_battery_positive_to_gnd_insulation_resistance=" + power_battery_positive_to_gnd_insulation_resistance + ", power_battery_negative_resistance_to_gnd_insulation_resistance=" + power_battery_negative_resistance_to_gnd_insulation_resistance + ", single_cell_temperature="
				+ single_cell_temperature + ", single_cell_minimum_temperature=" + single_cell_minimum_temperature + ", power_battery_available_energy=" + power_battery_available_energy + ", power_battery_available_capacity=" + power_battery_available_capacity + ", effective_cell_voltage="
				+ effective_cell_voltage + ", effective_temperature_collection_points=" + effective_temperature_collection_points + ", dcdc_current_status=" + dcdc_current_status + ", slow_charge_cc_voltage=" + slow_charge_cc_voltage + ", low_battery_alert=" + low_battery_alert + ", driving_range="
				+ driving_range + ", mileage_value=" + mileage_value + ", prohibited_high_voltage_power_on_flag=" + prohibited_high_voltage_power_on_flag + ", vehicle_bootloader_flag=" + vehicle_bootloader_flag + ", on_board_charger_output_voltage_instruction="
				+ on_board_charger_output_voltage_instruction + ", car_charger_output_current_instruction=" + car_charger_output_current_instruction + ", car_charger_work_instruction=" + car_charger_work_instruction + ", car_charger_network_status_control_command="
				+ car_charger_network_status_control_command + ", charging=" + charging + ", power_battery_heater_relay_instruction=" + power_battery_heater_relay_instruction + ", high_voltage_power_down_request_vcu_charge_self_test_counter="
				+ high_voltage_power_down_request_vcu_charge_self_test_counter + ", high_voltage_power_down_request_charging=" + high_voltage_power_down_request_charging + ", remote_refresh_mode_enable_command=" + remote_refresh_mode_enable_command + ", system_fault_light_bms="
				+ system_fault_light_bms + ", power_battery_system_fault_indicator_vcu=" + power_battery_system_fault_indicator_vcu + ", troubleshooting_level=" + troubleshooting_level + ", collision_signal_status=" + collision_signal_status + ", operating_mode=" + operating_mode
				+ ", battery_pack1_monomer_minimum_number=" + battery_pack1_monomer_minimum_number + ", battery_pack1_monomer_maximum_number=" + battery_pack1_monomer_maximum_number + ", battery_pack1_maximum_temperature=" + battery_pack1_maximum_temperature + ", battery_pack1_minimum_temperature="
				+ battery_pack1_minimum_temperature + ", temperature_sensor1=" + temperature_sensor1 + ", temperature_sensor2=" + temperature_sensor2 + ", temperature_sensor3=" + temperature_sensor3 + ", temperature_sensor4=" + temperature_sensor4 + ", temperature_sensor5=" + temperature_sensor5
				+ ", temperature_sensor6=" + temperature_sensor6 + ", temperature_sensor7=" + temperature_sensor7 + ", temperature_sensor8=" + temperature_sensor8 + ", temperature_sensor9=" + temperature_sensor9 + ", total_milage=" + total_milage + ", current_status_of_car_charger="
				+ current_status_of_car_charger + ", car_charge_wakeup_output_signal_status=" + car_charge_wakeup_output_signal_status + ", slow_charge_gun_connection_status=" + slow_charge_gun_connection_status + ", charging_mode=" + charging_mode + ", power_supply_equipment_status="
				+ power_supply_equipment_status + ", charger_output_current=" + charger_output_current + ", charger_output_voltage=" + charger_output_voltage + ", speed=" + speed + ", power_battery_pack_number=" + power_battery_pack_number + ", power_battery_pack_number_length="
				+ power_battery_pack_number_length + ", power_battery_subsystem_number=" + power_battery_subsystem_number + ", total_number_of_battery_cells=" + total_number_of_battery_cells + ", power_battery_temperature_point_total=" + power_battery_temperature_point_total
				+ ", total_battery_power_failure=" + total_battery_power_failure + ", cell_voltage_nr1=" + cell_voltage_nr1 + ", cell_voltage_nr2=" + cell_voltage_nr2 + ", cell_voltage_nr3=" + cell_voltage_nr3 + ", cell_voltage_nr4=" + cell_voltage_nr4 + ", cell_voltage_nr_5=" + cell_voltage_nr_5
				+ ", cell_voltage_nr6=" + cell_voltage_nr6 + ", cell_voltage_nr7=" + cell_voltage_nr7 + ", cell_voltage_nr8=" + cell_voltage_nr8 + ", cell_voltage_nr9=" + cell_voltage_nr9 + ", cell_voltage_nr10=" + cell_voltage_nr10 + ", cell_voltage_nr11=" + cell_voltage_nr11
				+ ", cell_voltage_nr12=" + cell_voltage_nr12 + ", cell_voltage_nr13=" + cell_voltage_nr13 + ", cell_voltage_nr14=" + cell_voltage_nr14 + ", cell_voltage_nr15=" + cell_voltage_nr15 + ", cell_voltage_nr16=" + cell_voltage_nr16 + ", cell_voltage_nr17=" + cell_voltage_nr17
				+ ", cell_voltage_nr18=" + cell_voltage_nr18 + ", cell_voltage_nr19=" + cell_voltage_nr19 + ", cell_voltage_nr20=" + cell_voltage_nr20 + ", cell_voltage_nr21=" + cell_voltage_nr21 + ", cell_voltage_nr22=" + cell_voltage_nr22 + ", cell_voltage_nr23=" + cell_voltage_nr23
				+ ", cell_voltage_nr24=" + cell_voltage_nr24 + ", cell_voltage_nr25=" + cell_voltage_nr25 + ", cell_voltage_nr26=" + cell_voltage_nr26 + ", cell_voltage_nr27=" + cell_voltage_nr27 + ", cell_voltage_nr28=" + cell_voltage_nr28 + ", cell_voltage_nr29=" + cell_voltage_nr29
				+ ", cell_voltage_nr30=" + cell_voltage_nr30 + ", cell_voltage_nr31=" + cell_voltage_nr31 + ", maximum_unit_voltage_number=" + maximum_unit_voltage_number + ", maximum_temperature_number=" + maximum_temperature_number + ", lowest_temperature_number=" + lowest_temperature_number
				+ ", lowest_cell_voltage_number=" + lowest_cell_voltage_number + ", maximum_unit_voltage_package_number=" + maximum_unit_voltage_package_number + ", maximum_temperature_package_number=" + maximum_temperature_package_number + ", minimum_temperature_package_number="
				+ minimum_temperature_package_number + ", lowest_monomer_voltage_package_number=" + lowest_monomer_voltage_package_number + ", id=" + id + "]";
	}
	
	//TODO: remove this later. 
	// or just keep it for testing
	public String toShortString()
	{
		return "Battery [id=" + id + ", time=" + dtime + ", vehicle_model=" + vehicle + ", brake=" + brake + ", motor_temperature=" + motor_temperature + ", battery_voltage=" + battery_voltage + ", slow_charge_wakeup_signal="	+ slow_charge_wakeup_signal + "]";
	}

	public int getVehicle()
	{
		return vehicle;
	}

	public void setVehicle(int vehicle)
	{
		this.vehicle = vehicle;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Date getTime()
	{
		return dtime;
	}
	public void setTime(Date time)
	{
		this.dtime = time;
	}
	public int getMisoperation()
	{
		return misoperation;
	}
	public void setMisoperation(int misoperation)
	{
		this.misoperation = misoperation;
	}
	public int getMotor_current_state()
	{
		return motor_current_state;
	}
	public void setMotor_current_state(int motor_current_state)
	{
		this.motor_current_state = motor_current_state;
	}
	public int getBrake()
	{
		return brake;
	}
	public void setBrake(int brake)
	{
		this.brake = brake;
	}
	public int getMotor_temperature()
	{
		return motor_temperature;
	}
	public void setMotor_temperature(int motor_temperature)
	{
		this.motor_temperature = motor_temperature;
	}
	public int getSystem_fault_light()
	{
		return system_fault_light;
	}
	public void setSystem_fault_light(int system_fault_light)
	{
		this.system_fault_light = system_fault_light;
	}
	public int getBraking_system_fault_display()
	{
		return braking_system_fault_display;
	}
	public void setBraking_system_fault_display(int braking_system_fault_display)
	{
		this.braking_system_fault_display = braking_system_fault_display;
	}
	public float getAccelerator_opening()
	{
		return accelerator_opening;
	}
	public void setAccelerator_opening(float accelerator_opening)
	{
		this.accelerator_opening = accelerator_opening;
	}
	public int getHigh_voltage_detection_complete_flag()
	{
		return high_voltage_detection_complete_flag;
	}
	public void setHigh_voltage_detection_complete_flag(int high_voltage_detection_complete_flag)
	{
		this.high_voltage_detection_complete_flag = high_voltage_detection_complete_flag;
	}
	public int getLow_voltage_power_off_request_flag()
	{
		return low_voltage_power_off_request_flag;
	}
	public void setLow_voltage_power_off_request_flag(int low_voltage_power_off_request_flag)
	{
		this.low_voltage_power_off_request_flag = low_voltage_power_off_request_flag;
	}
	public int getCurrent_motor_speed()
	{
		return current_motor_speed;
	}
	public void setCurrent_motor_speed(int current_motor_speed)
	{
		this.current_motor_speed = current_motor_speed;
	}
	public float getCurrent_motor_torque()
	{
		return current_motor_torque;
	}
	public void setCurrent_motor_torque(float current_motor_torque)
	{
		this.current_motor_torque = current_motor_torque;
	}
	public float getDc_bus_voltage()
	{
		return dc_bus_voltage;
	}
	public void setDc_bus_voltage(float dc_bus_voltage)
	{
		this.dc_bus_voltage = dc_bus_voltage;
	}
	public float getDc_bus_current()
	{
		return dc_bus_current;
	}
	public void setDc_bus_current(float dc_bus_current)
	{
		this.dc_bus_current = dc_bus_current;
	}
	public float getMotor_phase_current_effective_value()
	{
		return motor_phase_current_effective_value;
	}
	public void setMotor_phase_current_effective_value(float motor_phase_current_effective_value)
	{
		this.motor_phase_current_effective_value = motor_phase_current_effective_value;
	}
	public float getMotor_maximum_drive_torque()
	{
		return motor_maximum_drive_torque;
	}
	public void setMotor_maximum_drive_torque(float motor_maximum_drive_torque)
	{
		this.motor_maximum_drive_torque = motor_maximum_drive_torque;
	}
	public float getMotorr_maximum_braking_torque()
	{
		return motorr_maximum_braking_torque;
	}
	public void setMotorr_maximum_braking_torque(float motorr_maximum_braking_torque)
	{
		this.motorr_maximum_braking_torque = motorr_maximum_braking_torque;
	}
	public float getSpeed_signal()
	{
		return speed_signal;
	}
	public void setSpeed_signal(float speed_signal)
	{
		this.speed_signal = speed_signal;
	}
	public int getActive_drive()
	{
		return active_drive;
	}
	public void setActive_drive(int active_drive)
	{
		this.active_drive = active_drive;
	}
	public float getDrive_motor_output_power_mcu_part_number()
	{
		return drive_motor_output_power_mcu_part_number;
	}
	public void setDrive_motor_output_power_mcu_part_number(float drive_motor_output_power_mcu_part_number)
	{
		this.drive_motor_output_power_mcu_part_number = drive_motor_output_power_mcu_part_number;
	}
	public float getAccelerator_pedal_voltage()
	{
		return accelerator_pedal_voltage;
	}
	public void setAccelerator_pedal_voltage(float accelerator_pedal_voltage)
	{
		this.accelerator_pedal_voltage = accelerator_pedal_voltage;
	}
	public float getGear_switch_a_voltage()
	{
		return gear_switch_a_voltage;
	}
	public void setGear_switch_a_voltage(float gear_switch_a_voltage)
	{
		this.gear_switch_a_voltage = gear_switch_a_voltage;
	}
	public float getGear_switch_b_voltage()
	{
		return gear_switch_b_voltage;
	}
	public void setGear_switch_b_voltage(float gear_switch_b_voltage)
	{
		this.gear_switch_b_voltage = gear_switch_b_voltage;
	}
	public float getGear_switch_c_voltage()
	{
		return gear_switch_c_voltage;
	}
	public void setGear_switch_c_voltage(float gear_switch_c_voltage)
	{
		this.gear_switch_c_voltage = gear_switch_c_voltage;
	}
	public float getGear_switch_d_voltage()
	{
		return gear_switch_d_voltage;
	}
	public void setGear_switch_d_voltage(float gear_switch_d_voltage)
	{
		this.gear_switch_d_voltage = gear_switch_d_voltage;
	}
	public int getTotal_number_of_drive_motors()
	{
		return total_number_of_drive_motors;
	}
	public void setTotal_number_of_drive_motors(int total_number_of_drive_motors)
	{
		this.total_number_of_drive_motors = total_number_of_drive_motors;
	}
	public int getDrive_motor_serial_number()
	{
		return drive_motor_serial_number;
	}
	public void setDrive_motor_serial_number(int drive_motor_serial_number)
	{
		this.drive_motor_serial_number = drive_motor_serial_number;
	}
	public int getTotal_number_of_drive_motor_failures()
	{
		return total_number_of_drive_motor_failures;
	}
	public void setTotal_number_of_drive_motor_failures(int total_number_of_drive_motor_failures)
	{
		this.total_number_of_drive_motor_failures = total_number_of_drive_motor_failures;
	}
	public float getBattery_voltage()
	{
		return battery_voltage;
	}
	public void setBattery_voltage(float battery_voltage)
	{
		this.battery_voltage = battery_voltage;
	}
	public int getSlow_charge_wakeup_signal()
	{
		return slow_charge_wakeup_signal;
	}
	public void setSlow_charge_wakeup_signal(int slow_charge_wakeup_signal)
	{
		this.slow_charge_wakeup_signal = slow_charge_wakeup_signal;
	}
	public int getVehicle_model()
	{
		return vehicle;
	}
	public void setVehicle_model(int vehicle_model)
	{
		this.vehicle = vehicle_model;
	}
	public int getPower_battery_positive_relay_current_control_command_status()
	{
		return power_battery_positive_relay_current_control_command_status;
	}
	public void setPower_battery_positive_relay_current_control_command_status(int power_battery_positive_relay_current_control_command_status)
	{
		this.power_battery_positive_relay_current_control_command_status = power_battery_positive_relay_current_control_command_status;
	}
	public int getPower_battery_precharge_relay_current_control_command_status()
	{
		return power_battery_precharge_relay_current_control_command_status;
	}
	public void setPower_battery_precharge_relay_current_control_command_status(int power_battery_precharge_relay_current_control_command_status)
	{
		this.power_battery_precharge_relay_current_control_command_status = power_battery_precharge_relay_current_control_command_status;
	}
	public float getSoc_state_of_charge()
	{
		return soc_state_of_charge;
	}
	public void setSoc_state_of_charge(float soc_state_of_charge)
	{
		this.soc_state_of_charge = soc_state_of_charge;
	}
	public float getCurrent_status_allows_maximum_feedback_power()
	{
		return current_status_allows_maximum_feedback_power;
	}
	public void setCurrent_status_allows_maximum_feedback_power(float current_status_allows_maximum_feedback_power)
	{
		this.current_status_allows_maximum_feedback_power = current_status_allows_maximum_feedback_power;
	}
	public float getCurrent_status_allows_maximum_discharge_power()
	{
		return current_status_allows_maximum_discharge_power;
	}
	public void setCurrent_status_allows_maximum_discharge_power(float current_status_allows_maximum_discharge_power)
	{
		this.current_status_allows_maximum_discharge_power = current_status_allows_maximum_discharge_power;
	}
	public int getBms_self_test_counter()
	{
		return bms_self_test_counter;
	}
	public void setBms_self_test_counter(int bms_self_test_counter)
	{
		this.bms_self_test_counter = bms_self_test_counter;
	}
	public float getPower_battery_internal_total_voltage_v1()
	{
		return power_battery_internal_total_voltage_v1;
	}
	public void setPower_battery_internal_total_voltage_v1(float power_battery_internal_total_voltage_v1)
	{
		this.power_battery_internal_total_voltage_v1 = power_battery_internal_total_voltage_v1;
	}
	public float getPower_battery_charge_discharge_current()
	{
		return power_battery_charge_discharge_current;
	}
	public void setPower_battery_charge_discharge_current(float power_battery_charge_discharge_current)
	{
		this.power_battery_charge_discharge_current = power_battery_charge_discharge_current;
	}
	public float getPower_battery_external_total_voltage_v2()
	{
		return power_battery_external_total_voltage_v2;
	}
	public void setPower_battery_external_total_voltage_v2(float power_battery_external_total_voltage_v2)
	{
		this.power_battery_external_total_voltage_v2 = power_battery_external_total_voltage_v2;
	}
	public float getPower_battery_load_voltage_v3()
	{
		return power_battery_load_voltage_v3;
	}
	public void setPower_battery_load_voltage_v3(float power_battery_load_voltage_v3)
	{
		this.power_battery_load_voltage_v3 = power_battery_load_voltage_v3;
	}
	public float getSingle_cell_core_voltage()
	{
		return single_cell_core_voltage;
	}
	public void setSingle_cell_core_voltage(float single_cell_core_voltage)
	{
		this.single_cell_core_voltage = single_cell_core_voltage;
	}
	public float getSingle_cell_minimum_voltage()
	{
		return single_cell_minimum_voltage;
	}
	public void setSingle_cell_minimum_voltage(float single_cell_minimum_voltage)
	{
		this.single_cell_minimum_voltage = single_cell_minimum_voltage;
	}
	public int getPower_battery_positive_to_gnd_insulation_resistance()
	{
		return power_battery_positive_to_gnd_insulation_resistance;
	}
	public void setPower_battery_positive_to_gnd_insulation_resistance(int power_battery_positive_to_gnd_insulation_resistance)
	{
		this.power_battery_positive_to_gnd_insulation_resistance = power_battery_positive_to_gnd_insulation_resistance;
	}
	public int getPower_battery_negative_resistance_to_gnd_insulation_resistance()
	{
		return power_battery_negative_resistance_to_gnd_insulation_resistance;
	}
	public void setPower_battery_negative_resistance_to_gnd_insulation_resistance(int power_battery_negative_resistance_to_gnd_insulation_resistance)
	{
		this.power_battery_negative_resistance_to_gnd_insulation_resistance = power_battery_negative_resistance_to_gnd_insulation_resistance;
	}
	public int getSingle_cell_temperature()
	{
		return single_cell_temperature;
	}
	public void setSingle_cell_temperature(int single_cell_temperature)
	{
		this.single_cell_temperature = single_cell_temperature;
	}
	public int getSingle_cell_minimum_temperature()
	{
		return single_cell_minimum_temperature;
	}
	public void setSingle_cell_minimum_temperature(int single_cell_minimum_temperature)
	{
		this.single_cell_minimum_temperature = single_cell_minimum_temperature;
	}
	public float getPower_battery_available_energy()
	{
		return power_battery_available_energy;
	}
	public void setPower_battery_available_energy(float power_battery_available_energy)
	{
		this.power_battery_available_energy = power_battery_available_energy;
	}
	public float getPower_battery_available_capacity()
	{
		return power_battery_available_capacity;
	}
	public void setPower_battery_available_capacity(float power_battery_available_capacity)
	{
		this.power_battery_available_capacity = power_battery_available_capacity;
	}
	public int getEffective_cell_voltage()
	{
		return effective_cell_voltage;
	}
	public void setEffective_cell_voltage(int effective_cell_voltage)
	{
		this.effective_cell_voltage = effective_cell_voltage;
	}
	public int getEffective_temperature_collection_points()
	{
		return effective_temperature_collection_points;
	}
	public void setEffective_temperature_collection_points(int effective_temperature_collection_points)
	{
		this.effective_temperature_collection_points = effective_temperature_collection_points;
	}
	public int getDcdc_current_status()
	{
		return dcdc_current_status;
	}
	public void setDcdc_current_status(int dcdc_current_status)
	{
		this.dcdc_current_status = dcdc_current_status;
	}
	public float getSlow_charge_cc_voltage()
	{
		return slow_charge_cc_voltage;
	}
	public void setSlow_charge_cc_voltage(float slow_charge_cc_voltage)
	{
		this.slow_charge_cc_voltage = slow_charge_cc_voltage;
	}
	public int getLow_battery_alert()
	{
		return low_battery_alert;
	}
	public void setLow_battery_alert(int low_battery_alert)
	{
		this.low_battery_alert = low_battery_alert;
	}
	public float getDriving_range()
	{
		return driving_range;
	}
	public void setDriving_range(float driving_range)
	{
		this.driving_range = driving_range;
	}
	public float getMileage_value()
	{
		return mileage_value;
	}
	public void setMileage_value(float mileage_value)
	{
		this.mileage_value = mileage_value;
	}
	public int getProhibited_high_voltage_power_on_flag()
	{
		return prohibited_high_voltage_power_on_flag;
	}
	public void setProhibited_high_voltage_power_on_flag(int prohibited_high_voltage_power_on_flag)
	{
		this.prohibited_high_voltage_power_on_flag = prohibited_high_voltage_power_on_flag;
	}
	public int getVehicle_bootloader_flag()
	{
		return vehicle_bootloader_flag;
	}
	public void setVehicle_bootloader_flag(int vehicle_bootloader_flag)
	{
		this.vehicle_bootloader_flag = vehicle_bootloader_flag;
	}
	public int getOn_board_charger_output_voltage_instruction()
	{
		return on_board_charger_output_voltage_instruction;
	}
	public void setOn_board_charger_output_voltage_instruction(int on_board_charger_output_voltage_instruction)
	{
		this.on_board_charger_output_voltage_instruction = on_board_charger_output_voltage_instruction;
	}
	public float getCar_charger_output_current_instruction()
	{
		return car_charger_output_current_instruction;
	}
	public void setCar_charger_output_current_instruction(float car_charger_output_current_instruction)
	{
		this.car_charger_output_current_instruction = car_charger_output_current_instruction;
	}
	public int getCar_charger_work_instruction()
	{
		return car_charger_work_instruction;
	}
	public void setCar_charger_work_instruction(int car_charger_work_instruction)
	{
		this.car_charger_work_instruction = car_charger_work_instruction;
	}
	public int getCar_charger_network_status_control_command()
	{
		return car_charger_network_status_control_command;
	}
	public void setCar_charger_network_status_control_command(int car_charger_network_status_control_command)
	{
		this.car_charger_network_status_control_command = car_charger_network_status_control_command;
	}
	public int getCharging()
	{
		return charging;
	}
	public void setCharging(int charging)
	{
		this.charging = charging;
	}
	public int getPower_battery_heater_relay_instruction()
	{
		return power_battery_heater_relay_instruction;
	}
	public void setPower_battery_heater_relay_instruction(int power_battery_heater_relay_instruction)
	{
		this.power_battery_heater_relay_instruction = power_battery_heater_relay_instruction;
	}
	public int getHigh_voltage_power_down_request_vcu_charge_self_test_counter()
	{
		return high_voltage_power_down_request_vcu_charge_self_test_counter;
	}
	public void setHigh_voltage_power_down_request_vcu_charge_self_test_counter(int high_voltage_power_down_request_vcu_charge_self_test_counter)
	{
		this.high_voltage_power_down_request_vcu_charge_self_test_counter = high_voltage_power_down_request_vcu_charge_self_test_counter;
	}
	public int getHigh_voltage_power_down_request_charging()
	{
		return high_voltage_power_down_request_charging;
	}
	public void setHigh_voltage_power_down_request_charging(int high_voltage_power_down_request_charging)
	{
		this.high_voltage_power_down_request_charging = high_voltage_power_down_request_charging;
	}
	public int getRemote_refresh_mode_enable_command()
	{
		return remote_refresh_mode_enable_command;
	}
	public void setRemote_refresh_mode_enable_command(int remote_refresh_mode_enable_command)
	{
		this.remote_refresh_mode_enable_command = remote_refresh_mode_enable_command;
	}
	public int getSystem_fault_light_bms()
	{
		return system_fault_light_bms;
	}
	public void setSystem_fault_light_bms(int system_fault_light_bms)
	{
		this.system_fault_light_bms = system_fault_light_bms;
	}
	public int getPower_battery_system_fault_indicator_vcu()
	{
		return power_battery_system_fault_indicator_vcu;
	}
	public void setPower_battery_system_fault_indicator_vcu(int power_battery_system_fault_indicator_vcu)
	{
		this.power_battery_system_fault_indicator_vcu = power_battery_system_fault_indicator_vcu;
	}
	public int getTroubleshooting_level()
	{
		return troubleshooting_level;
	}
	public void setTroubleshooting_level(int troubleshooting_level)
	{
		this.troubleshooting_level = troubleshooting_level;
	}
	public int getCollision_signal_status()
	{
		return collision_signal_status;
	}
	public void setCollision_signal_status(int collision_signal_status)
	{
		this.collision_signal_status = collision_signal_status;
	}
	public int getOperating_mode()
	{
		return operating_mode;
	}
	public void setOperating_mode(int operating_mode)
	{
		this.operating_mode = operating_mode;
	}
	public int getBattery_pack1_monomer_minimum_number()
	{
		return battery_pack1_monomer_minimum_number;
	}
	public void setBattery_pack1_monomer_minimum_number(int battery_pack1_monomer_minimum_number)
	{
		this.battery_pack1_monomer_minimum_number = battery_pack1_monomer_minimum_number;
	}
	public int getBattery_pack1_monomer_maximum_number()
	{
		return battery_pack1_monomer_maximum_number;
	}
	public void setBattery_pack1_monomer_maximum_number(int battery_pack1_monomer_maximum_number)
	{
		this.battery_pack1_monomer_maximum_number = battery_pack1_monomer_maximum_number;
	}
	public int getBattery_pack1_maximum_temperature()
	{
		return battery_pack1_maximum_temperature;
	}
	public void setBattery_pack1_maximum_temperature(int battery_pack1_maximum_temperature)
	{
		this.battery_pack1_maximum_temperature = battery_pack1_maximum_temperature;
	}
	public int getBattery_pack1_minimum_temperature()
	{
		return battery_pack1_minimum_temperature;
	}
	public void setBattery_pack1_minimum_temperature(int battery_pack1_minimum_temperature)
	{
		this.battery_pack1_minimum_temperature = battery_pack1_minimum_temperature;
	}
	public int getTemperature_sensor1()
	{
		return temperature_sensor1;
	}
	public void setTemperature_sensor1(int temperature_sensor1)
	{
		this.temperature_sensor1 = temperature_sensor1;
	}
	public int getTemperature_sensor2()
	{
		return temperature_sensor2;
	}
	public void setTemperature_sensor2(int temperature_sensor2)
	{
		this.temperature_sensor2 = temperature_sensor2;
	}
	public int getTemperature_sensor3()
	{
		return temperature_sensor3;
	}
	public void setTemperature_sensor3(int temperature_sensor3)
	{
		this.temperature_sensor3 = temperature_sensor3;
	}
	public int getTemperature_sensor4()
	{
		return temperature_sensor4;
	}
	public void setTemperature_sensor4(int temperature_sensor4)
	{
		this.temperature_sensor4 = temperature_sensor4;
	}
	public int getTemperature_sensor5()
	{
		return temperature_sensor5;
	}
	public void setTemperature_sensor5(int temperature_sensor5)
	{
		this.temperature_sensor5 = temperature_sensor5;
	}
	public int getTemperature_sensor6()
	{
		return temperature_sensor6;
	}
	public void setTemperature_sensor6(int temperature_sensor6)
	{
		this.temperature_sensor6 = temperature_sensor6;
	}
	public int getTemperature_sensor7()
	{
		return temperature_sensor7;
	}
	public void setTemperature_sensor7(int temperature_sensor7)
	{
		this.temperature_sensor7 = temperature_sensor7;
	}
	public int getTemperature_sensor8()
	{
		return temperature_sensor8;
	}
	public void setTemperature_sensor8(int temperature_sensor8)
	{
		this.temperature_sensor8 = temperature_sensor8;
	}
	public int getTemperature_sensor9()
	{
		return temperature_sensor9;
	}
	public void setTemperature_sensor9(int temperature_sensor9)
	{
		this.temperature_sensor9 = temperature_sensor9;
	}
	public int getTotal_milage()
	{
		return total_milage;
	}
	public void setTotal_milage(int total_milage)
	{
		this.total_milage = total_milage;
	}
	public int getCurrent_status_of_car_charger()
	{
		return current_status_of_car_charger;
	}
	public void setCurrent_status_of_car_charger(int current_status_of_car_charger)
	{
		this.current_status_of_car_charger = current_status_of_car_charger;
	}
	public int getCar_charge_wakeup_output_signal_status()
	{
		return car_charge_wakeup_output_signal_status;
	}
	public void setCar_charge_wakeup_output_signal_status(int car_charge_wakeup_output_signal_status)
	{
		this.car_charge_wakeup_output_signal_status = car_charge_wakeup_output_signal_status;
	}
	public int getSlow_charge_gun_connection_status()
	{
		return slow_charge_gun_connection_status;
	}
	public void setSlow_charge_gun_connection_status(int slow_charge_gun_connection_status)
	{
		this.slow_charge_gun_connection_status = slow_charge_gun_connection_status;
	}
	public int getCharging_mode()
	{
		return charging_mode;
	}
	public void setCharging_mode(int charging_mode)
	{
		this.charging_mode = charging_mode;
	}
	public int getPower_supply_equipment_status()
	{
		return power_supply_equipment_status;
	}
	public void setPower_supply_equipment_status(int power_supply_equipment_status)
	{
		this.power_supply_equipment_status = power_supply_equipment_status;
	}
	public float getCharger_output_current()
	{
		return charger_output_current;
	}
	public void setCharger_output_current(float charger_output_current)
	{
		this.charger_output_current = charger_output_current;
	}
	public float getCharger_output_voltage()
	{
		return charger_output_voltage;
	}
	public void setCharger_output_voltage(float charger_output_voltage)
	{
		this.charger_output_voltage = charger_output_voltage;
	}
	public float getSpeed()
	{
		return speed;
	}
	public void setSpeed(float speed)
	{
		this.speed = speed;
	}
	public int getPower_battery_pack_number()
	{
		return power_battery_pack_number;
	}
	public void setPower_battery_pack_number(int power_battery_pack_number)
	{
		this.power_battery_pack_number = power_battery_pack_number;
	}
	public int getPower_battery_pack_number_length()
	{
		return power_battery_pack_number_length;
	}
	public void setPower_battery_pack_number_length(int power_battery_pack_number_length)
	{
		this.power_battery_pack_number_length = power_battery_pack_number_length;
	}
	public int getPower_battery_subsystem_number()
	{
		return power_battery_subsystem_number;
	}
	public void setPower_battery_subsystem_number(int power_battery_subsystem_number)
	{
		this.power_battery_subsystem_number = power_battery_subsystem_number;
	}
	public int getTotal_number_of_battery_cells()
	{
		return total_number_of_battery_cells;
	}
	public void setTotal_number_of_battery_cells(int total_number_of_battery_cells)
	{
		this.total_number_of_battery_cells = total_number_of_battery_cells;
	}
	public int getPower_battery_temperature_point_total()
	{
		return power_battery_temperature_point_total;
	}
	public void setPower_battery_temperature_point_total(int power_battery_temperature_point_total)
	{
		this.power_battery_temperature_point_total = power_battery_temperature_point_total;
	}
	public int getTotal_battery_power_failure()
	{
		return total_battery_power_failure;
	}
	public void setTotal_battery_power_failure(int total_battery_power_failure)
	{
		this.total_battery_power_failure = total_battery_power_failure;
	}
	public float getCell_voltage_nr1()
	{
		return cell_voltage_nr1;
	}
	public void setCell_voltage_nr1(float cell_voltage_nr1)
	{
		this.cell_voltage_nr1 = cell_voltage_nr1;
	}
	public float getCell_voltage_nr2()
	{
		return cell_voltage_nr2;
	}
	public void setCell_voltage_nr2(float cell_voltage_nr2)
	{
		this.cell_voltage_nr2 = cell_voltage_nr2;
	}
	public float getCell_voltage_nr3()
	{
		return cell_voltage_nr3;
	}
	public void setCell_voltage_nr3(float cell_voltage_nr3)
	{
		this.cell_voltage_nr3 = cell_voltage_nr3;
	}
	public float getCell_voltage_nr4()
	{
		return cell_voltage_nr4;
	}
	public void setCell_voltage_nr4(float cell_voltage_nr4)
	{
		this.cell_voltage_nr4 = cell_voltage_nr4;
	}
	public float getCell_voltage_nr_5()
	{
		return cell_voltage_nr_5;
	}
	public void setCell_voltage_nr_5(float cell_voltage_nr_5)
	{
		this.cell_voltage_nr_5 = cell_voltage_nr_5;
	}
	public float getCell_voltage_nr6()
	{
		return cell_voltage_nr6;
	}
	public void setCell_voltage_nr6(float cell_voltage_nr6)
	{
		this.cell_voltage_nr6 = cell_voltage_nr6;
	}
	public float getCell_voltage_nr7()
	{
		return cell_voltage_nr7;
	}
	public void setCell_voltage_nr7(float cell_voltage_nr7)
	{
		this.cell_voltage_nr7 = cell_voltage_nr7;
	}
	public float getCell_voltage_nr8()
	{
		return cell_voltage_nr8;
	}
	public void setCell_voltage_nr8(float cell_voltage_nr8)
	{
		this.cell_voltage_nr8 = cell_voltage_nr8;
	}
	public float getCell_voltage_nr9()
	{
		return cell_voltage_nr9;
	}
	public void setCell_voltage_nr9(float cell_voltage_nr9)
	{
		this.cell_voltage_nr9 = cell_voltage_nr9;
	}
	public float getCell_voltage_nr10()
	{
		return cell_voltage_nr10;
	}
	public void setCell_voltage_nr10(float cell_voltage_nr10)
	{
		this.cell_voltage_nr10 = cell_voltage_nr10;
	}
	public float getCell_voltage_nr11()
	{
		return cell_voltage_nr11;
	}
	public void setCell_voltage_nr11(float cell_voltage_nr11)
	{
		this.cell_voltage_nr11 = cell_voltage_nr11;
	}
	public float getCell_voltage_nr12()
	{
		return cell_voltage_nr12;
	}
	public void setCell_voltage_nr12(float cell_voltage_nr12)
	{
		this.cell_voltage_nr12 = cell_voltage_nr12;
	}
	public float getCell_voltage_nr13()
	{
		return cell_voltage_nr13;
	}
	public void setCell_voltage_nr13(float cell_voltage_nr13)
	{
		this.cell_voltage_nr13 = cell_voltage_nr13;
	}
	public float getCell_voltage_nr14()
	{
		return cell_voltage_nr14;
	}
	public void setCell_voltage_nr14(float cell_voltage_nr14)
	{
		this.cell_voltage_nr14 = cell_voltage_nr14;
	}
	public float getCell_voltage_nr15()
	{
		return cell_voltage_nr15;
	}
	public void setCell_voltage_nr15(float cell_voltage_nr15)
	{
		this.cell_voltage_nr15 = cell_voltage_nr15;
	}
	public float getCell_voltage_nr16()
	{
		return cell_voltage_nr16;
	}
	public void setCell_voltage_nr16(float cell_voltage_nr16)
	{
		this.cell_voltage_nr16 = cell_voltage_nr16;
	}
	public float getCell_voltage_nr17()
	{
		return cell_voltage_nr17;
	}
	public void setCell_voltage_nr17(float cell_voltage_nr17)
	{
		this.cell_voltage_nr17 = cell_voltage_nr17;
	}
	public float getCell_voltage_nr18()
	{
		return cell_voltage_nr18;
	}
	public void setCell_voltage_nr18(float cell_voltage_nr18)
	{
		this.cell_voltage_nr18 = cell_voltage_nr18;
	}
	public float getCell_voltage_nr19()
	{
		return cell_voltage_nr19;
	}
	public void setCell_voltage_nr19(float cell_voltage_nr19)
	{
		this.cell_voltage_nr19 = cell_voltage_nr19;
	}
	public float getCell_voltage_nr20()
	{
		return cell_voltage_nr20;
	}
	public void setCell_voltage_nr20(float cell_voltage_nr20)
	{
		this.cell_voltage_nr20 = cell_voltage_nr20;
	}
	public float getCell_voltage_nr21()
	{
		return cell_voltage_nr21;
	}
	public void setCell_voltage_nr21(float cell_voltage_nr21)
	{
		this.cell_voltage_nr21 = cell_voltage_nr21;
	}
	public float getCell_voltage_nr22()
	{
		return cell_voltage_nr22;
	}
	public void setCell_voltage_nr22(float cell_voltage_nr22)
	{
		this.cell_voltage_nr22 = cell_voltage_nr22;
	}
	public float getCell_voltage_nr23()
	{
		return cell_voltage_nr23;
	}
	public void setCell_voltage_nr23(float cell_voltage_nr23)
	{
		this.cell_voltage_nr23 = cell_voltage_nr23;
	}
	public float getCell_voltage_nr24()
	{
		return cell_voltage_nr24;
	}
	public void setCell_voltage_nr24(float cell_voltage_nr24)
	{
		this.cell_voltage_nr24 = cell_voltage_nr24;
	}
	public float getCell_voltage_nr25()
	{
		return cell_voltage_nr25;
	}
	public void setCell_voltage_nr25(float cell_voltage_nr25)
	{
		this.cell_voltage_nr25 = cell_voltage_nr25;
	}
	public float getCell_voltage_nr26()
	{
		return cell_voltage_nr26;
	}
	public void setCell_voltage_nr26(float cell_voltage_nr26)
	{
		this.cell_voltage_nr26 = cell_voltage_nr26;
	}
	public float getCell_voltage_nr27()
	{
		return cell_voltage_nr27;
	}
	public void setCell_voltage_nr27(float cell_voltage_nr27)
	{
		this.cell_voltage_nr27 = cell_voltage_nr27;
	}
	public float getCell_voltage_nr28()
	{
		return cell_voltage_nr28;
	}
	public void setCell_voltage_nr28(float cell_voltage_nr28)
	{
		this.cell_voltage_nr28 = cell_voltage_nr28;
	}
	public float getCell_voltage_nr29()
	{
		return cell_voltage_nr29;
	}
	public void setCell_voltage_nr29(float cell_voltage_nr29)
	{
		this.cell_voltage_nr29 = cell_voltage_nr29;
	}
	public float getCell_voltage_nr30()
	{
		return cell_voltage_nr30;
	}
	public void setCell_voltage_nr30(float cell_voltage_nr30)
	{
		this.cell_voltage_nr30 = cell_voltage_nr30;
	}
	public float getCell_voltage_nr31()
	{
		return cell_voltage_nr31;
	}
	public void setCell_voltage_nr31(float cell_voltage_nr31)
	{
		this.cell_voltage_nr31 = cell_voltage_nr31;
	}
	public int getMaximum_unit_voltage_number()
	{
		return maximum_unit_voltage_number;
	}
	public void setMaximum_unit_voltage_number(int maximum_unit_voltage_number)
	{
		this.maximum_unit_voltage_number = maximum_unit_voltage_number;
	}
	public int getMaximum_temperature_number()
	{
		return maximum_temperature_number;
	}
	public void setMaximum_temperature_number(int maximum_temperature_number)
	{
		this.maximum_temperature_number = maximum_temperature_number;
	}
	public int getLowest_temperature_number()
	{
		return lowest_temperature_number;
	}
	public void setLowest_temperature_number(int lowest_temperature_number)
	{
		this.lowest_temperature_number = lowest_temperature_number;
	}
	public int getLowest_cell_voltage_number()
	{
		return lowest_cell_voltage_number;
	}
	public void setLowest_cell_voltage_number(int lowest_cell_voltage_number)
	{
		this.lowest_cell_voltage_number = lowest_cell_voltage_number;
	}
	public int getMaximum_unit_voltage_package_number()
	{
		return maximum_unit_voltage_package_number;
	}
	public void setMaximum_unit_voltage_package_number(int maximum_unit_voltage_package_number)
	{
		this.maximum_unit_voltage_package_number = maximum_unit_voltage_package_number;
	}
	public int getMaximum_temperature_package_number()
	{
		return maximum_temperature_package_number;
	}
	public void setMaximum_temperature_package_number(int maximum_temperature_package_number)
	{
		this.maximum_temperature_package_number = maximum_temperature_package_number;
	}
	public int getMinimum_temperature_package_number()
	{
		return minimum_temperature_package_number;
	}
	public void setMinimum_temperature_package_number(int minimum_temperature_package_number)
	{
		this.minimum_temperature_package_number = minimum_temperature_package_number;
	}
	public int getLowest_monomer_voltage_package_number()
	{
		return lowest_monomer_voltage_package_number;
	}
	public void setLowest_monomer_voltage_package_number(int lowest_monomer_voltage_package_number)
	{
		this.lowest_monomer_voltage_package_number = lowest_monomer_voltage_package_number;
	}
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
}
