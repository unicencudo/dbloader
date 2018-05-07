package com.smu.unicen.ul.cudo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.smu.unicen.ul.cudo.entities.common.BaseEntity;

@Entity
@Table(name="TBL_LOCATION", schema="CUDO")
public class Location extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LOCATION_ID")
    private Long LocationId;
	
	@Column(name="LOCATION_TYPE")
    private String LocationType;
	
	@Column(name="LOCATION_NAME")
    private String LocationName;
	
	@Column(name="LATITUDE")
    private Double Latitude;
	
	@Column(name="LONGITUDE")
    private Double Longitude;
	
	@Column(name="ADDRESS")
    private String Address;

	@Column(name="NO_OF_SLOTS")
    private Long NoOfSlots;
	
	@Column(name="NO_OF_SLOTS_IMO")
    private Long NoOfSlotsIMO;
	
	@Column(name="NO_OF_SLOTS_HEAVY")
    private Long NoOfSlotsHeavy;
	
	@Column(name="NO_OF_SLOTS_HIGH")
    private Long NoOfSlotsHigh;
	
	@Column(name="MAX_VEH_HEIGHT")
    private Long MaxVehicleHeight;
	
	@Column(name="MAX_VEH_LENGTH")
    private Long MaxVehicleLength;
	
	@Column(name="OPENING_HOUR")
	@Temporal (TemporalType.TIME)
    private Date OpeningHour;
	
	@Column(name="CLOSING_HOUR")
	@Temporal (TemporalType.TIME)
    private Date ClosingHour;
	
	@Column(name="IMDA_MALL")
    private boolean isIMDAMall;

	public Location(int userId) {
		super(userId);
	}

	@Override
	public String toString() {
		return "Delivery [LocationId=" + LocationId + ", LocationType=" + LocationType + ", LocationName="
				+ LocationName + ", Latitude=" + Latitude + ", Longitude=" + Longitude + ", Address=" + Address
				+ ", NoOfSlots=" + NoOfSlots + ", NoOfSlotsIMO=" + NoOfSlotsIMO + ", NoOfSlotsHeavy=" + NoOfSlotsHeavy
				+ ", NoOfSlotsHigh=" + NoOfSlotsHigh + ", MaxVehicleHeight=" + MaxVehicleHeight + ", MaxVehicleLength="
				+ MaxVehicleLength + ", OpeningHour=" + OpeningHour + ", ClosingHour=" + ClosingHour + ", isIMDAMall="
				+ isIMDAMall + "]";
	}

	public Long getLocationId() {
		return LocationId;
	}

	public void setLocationId(Long locationId) {
		LocationId = locationId;
	}

	public String getLocationType() {
		return LocationType;
	}

	public void setLocationType(String locationType) {
		LocationType = locationType;
	}

	public String getLocationName() {
		return LocationName;
	}

	public void setLocationName(String locationName) {
		LocationName = locationName;
	}

	public Double getLatitude() {
		return Latitude;
	}

	public void setLatitude(Double latitude) {
		Latitude = latitude;
	}

	public Double getLongitude() {
		return Longitude;
	}

	public void setLongitude(Double longitude) {
		Longitude = longitude;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Long getNoOfSlots() {
		return NoOfSlots;
	}

	public void setNoOfSlots(Long noOfSlots) {
		NoOfSlots = noOfSlots;
	}

	public Long getNoOfSlotsIMO() {
		return NoOfSlotsIMO;
	}

	public void setNoOfSlotsIMO(Long noOfSlotsIMO) {
		NoOfSlotsIMO = noOfSlotsIMO;
	}

	public Long getNoOfSlotsHeavy() {
		return NoOfSlotsHeavy;
	}

	public void setNoOfSlotsHeavy(Long noOfSlotsHeavy) {
		NoOfSlotsHeavy = noOfSlotsHeavy;
	}

	public Long getNoOfSlotsHigh() {
		return NoOfSlotsHigh;
	}

	public void setNoOfSlotsHigh(Long noOfSlotsHigh) {
		NoOfSlotsHigh = noOfSlotsHigh;
	}

	public Long getMaxVehicleHeight() {
		return MaxVehicleHeight;
	}

	public void setMaxVehicleHeight(Long maxVehicleHeight) {
		MaxVehicleHeight = maxVehicleHeight;
	}

	public Long getMaxVehicleLength() {
		return MaxVehicleLength;
	}

	public void setMaxVehicleLength(Long maxVehicleLength) {
		MaxVehicleLength = maxVehicleLength;
	}

	public Date getOpeningHour() {
		return OpeningHour;
	}

	public void setOpeningHour(Date openingHour) {
		OpeningHour = openingHour;
	}

	public Date getClosingHour() {
		return ClosingHour;
	}

	public void setClosingHour(Date closingHour) {
		ClosingHour = closingHour;
	}

	public boolean isIMDAMall() {
		return isIMDAMall;
	}

	public void setIMDAMall(boolean isIMDAMall) {
		this.isIMDAMall = isIMDAMall;
	}
}
