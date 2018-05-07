package com.smu.unicen.ul.cudo.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.smu.unicen.ul.cudo.entities.Vehicle;
import com.smu.unicen.ul.cudo.entities.common.BaseEntity;

@Entity
@Table(name="TBL_VEHICLE_AVAILTIME", schema="CUDO")
public class VehicleAvailTime extends BaseEntity{

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="VEHICLE_AVAILTIME_ID")
    private Long vehicleAvailTimeId;
	
	@JoinColumn(name = "DAY_OF_WEEK", referencedColumnName = "CODE_ID")
	private int DayOfWeek;
	
	@Column(name="AVAIL_TIME_FROM")
	@Temporal (TemporalType.TIME)
    private Date AvailTimeFrom;
	
	@Column(name="AVAIL_TIME_TO")
	@Temporal (TemporalType.TIME)
    private Date AvailTimeTo;
	
	@JoinColumn(name = "VEHICLE_ID", referencedColumnName = "VEHICLE_ID")
	@ManyToOne( fetch = FetchType.EAGER)
    private Vehicle vehicle;
	
	public VehicleAvailTime(int userId){
		super(userId);
	}

	public Long getVehicleAvailTimeId() {
		return vehicleAvailTimeId;
	}

	public void setVehicleAvailTimeId(Long vehicleAvailTimeId) {
		this.vehicleAvailTimeId = vehicleAvailTimeId;
	}

	public int getDayOfWeek() {
		return DayOfWeek;
	}

	public void setDayOfWeek(int dayOfWeek) {
		DayOfWeek = dayOfWeek;
	}

	public Date getAvailTimeFrom() {
		return AvailTimeFrom;
	}

	public void setAvailTimeFrom(Date availTimeFrom) {
		AvailTimeFrom = availTimeFrom;
	}

	public Date getAvailTimeTo() {
		return AvailTimeTo;
	}

	public void setAvailTimeTo(Date availTimeTo) {
		AvailTimeTo = availTimeTo;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
}
