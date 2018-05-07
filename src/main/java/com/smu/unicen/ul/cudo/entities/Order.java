package com.smu.unicen.ul.cudo.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.smu.unicen.ul.cudo.entities.common.BaseEntity;

@Entity
@Table(name="TBL_ORDER", schema="CUDO")
public class Order extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ORDER_ID")
    private Long OrderId;
	
	@Column(name="WEIGHT")
    private double Weight;
	
	@Column(name="VOLUME")
    private double Volume;
	
	@Column(name="ORDER_DESC")
    private String OrderDesc;
	
	@JoinColumn(name = "LOCATION_ID", referencedColumnName = "LOCATION_ID")
	@OneToOne( cascade={CascadeType.MERGE}, fetch = FetchType.EAGER)
    private Location Location;
	
	@Column(name="EARLIEST_TIME")
	@Temporal (TemporalType.TIMESTAMP)
    private Date EarliestTime;
	
	@Column(name="LATEST_TIME")
	@Temporal (TemporalType.TIMESTAMP)
    private Date LatestTime;
	
	@Column(name="DELIVERY_DATE")
	@Temporal (TemporalType.TIMESTAMP)
    private Date DeliveryDate;
	
	@JoinColumn(name = "VEHICLE_ID", referencedColumnName = "VEHICLE_ID")
	@OneToOne( cascade={CascadeType.MERGE}, fetch = FetchType.EAGER)
    private Vehicle Vehicle;
	
//	@JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
//	@OneToMany( cascade={CascadeType.ALL}, fetch = FetchType.EAGER)
//    private Set<Delivery> Delivery;
	
	public Order(int userId) {
		super(userId);
	}

	public Long getOrderId() {
		return OrderId;
	}

	public void setOrderId(Long orderId) {
		OrderId = orderId;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		Weight = weight;
	}

	public double getVolume() {
		return Volume;
	}

	public void setVolume(double volume) {
		Volume = volume;
	}

	public String getOrderDesc() {
		return OrderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		OrderDesc = orderDesc;
	}

	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location location) {
		Location = location;
	}

	public Date getEarliestTime() {
		return EarliestTime;
	}

	public void setEarliestTime(Date earliestTime) {
		EarliestTime = earliestTime;
	}

	public Date getLatestTime() {
		return LatestTime;
	}

	public void setLatestTime(Date latestTime) {
		LatestTime = latestTime;
	}

	public Date getDeliveryDate() {
		return DeliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		DeliveryDate = deliveryDate;
	}

	public Vehicle getVehicle() {
		return Vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		Vehicle = vehicle;
	}

	
}
