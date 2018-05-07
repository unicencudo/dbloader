package com.smu.unicen.ul.cudo.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.smu.unicen.ul.cudo.entities.common.BaseEntity;

@Entity
@Table(name="TBL_DELIVERY_PLAN", schema="CUDO")
public class DeliveryPlan extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DELIVERY_PLAN_ID")
    private Long DeliveryId;
	
	@JoinColumn(name = "VEHICLE_ID", referencedColumnName = "VEHICLE_ID")
	@OneToOne( cascade={CascadeType.MERGE}, fetch = FetchType.EAGER)
    private Vehicle Vehicle;
	
	@Column(name="START_TIME")
	@Temporal (TemporalType.TIMESTAMP)
    private Date StartTime;
	
	@Column(name="COST")
    private Long Cost;
	
	@Column(name="TOTAL_TRAVEL_TIME")
    private Long TravelTime;
	
	public DeliveryPlan(int userId) {
		super(userId);
	}

	public Long getDeliveryId() {
		return DeliveryId;
	}

	public void setDeliveryId(Long deliveryId) {
		DeliveryId = deliveryId;
	}

	public Vehicle getVehicle() {
		return Vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		Vehicle = vehicle;
	}

	public Date getStartTime() {
		return StartTime;
	}

	public void setStartTime(Date startTime) {
		StartTime = startTime;
	}

	public Long getCost() {
		return Cost;
	}

	public void setCost(Long cost) {
		Cost = cost;
	}

	public Long getTravelTime() {
		return TravelTime;
	}

	public void setTravelTime(Long travelTime) {
		TravelTime = travelTime;
	}

	@Override
	public String toString() {
		return "DeliveryPlan [DeliveryId=" + DeliveryId + ", Vehicle=" + Vehicle.getVehicleRegNo() + ", StartTime=" + StartTime
				+ ", Cost=" + Cost + ", TravelTime=" + TravelTime + "]";
	}
	
	
}
