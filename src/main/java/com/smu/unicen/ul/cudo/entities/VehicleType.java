package com.smu.unicen.ul.cudo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.smu.unicen.ul.cudo.entities.common.BaseEntity;

@Entity
@Table(name="TBL_VEHICLE_TYPE", schema="CUDO")
public class VehicleType extends BaseEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="VEHICLE_TYPE_ID")
    private Long VehicleTypeId;
	
	@Column(name="NAME")
    private String Name;
	
	@Column(name="DESCRIPTION")
    private String Description;
	
	@Column(name="HEIGHT")
    private int Height;
	
	@Column(name="LENGTH")
    private int Length;
	
	@Column(name="WEIGHT")
    private int Weight;
	
	@Column(name="VOLUME")
    private int Volume;	

	public VehicleType(){}

	public Long getVehicleTypeId() {
		return VehicleTypeId;
	}

	public void setVehicleTypeId(Long vehicleTypeId) {
		VehicleTypeId = vehicleTypeId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public int getVolume() {
		return Volume;
	}

	public void setVolume(int volume) {
		Volume = volume;
	}

	
}
