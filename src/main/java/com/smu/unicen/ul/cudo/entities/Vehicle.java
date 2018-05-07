package com.smu.unicen.ul.cudo.entities;

import com.smu.unicen.ul.cudo.entities.common.BaseEntity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Where;


@Entity
@Table(name="TBL_VEHICLE", schema="CUDO")
public class Vehicle extends BaseEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="VEHICLE_ID")
    private Long  VehicleId;
	
	@JoinColumn(name = "VEHICLE_TYPE_ID", referencedColumnName = "VEHICLE_TYPE_ID")
	@ManyToOne( fetch = FetchType.EAGER)
    private VehicleType  VehicleType;
	
	@Column(name="VEHICLE_REG_NO")
    private String VehicleRegNo;
	
	@JoinColumn(name = "LOCATION_ID", referencedColumnName = "LOCATION_ID")
	@OneToOne( cascade={CascadeType.MERGE}, fetch = FetchType.EAGER)
    private Location DepotLocation;
	
	@Column(name="LSP_ID")
    private Short LSPID ;
	
	@OneToMany (cascade = CascadeType.MERGE, mappedBy="vehicle", fetch = FetchType.EAGER)
	@Where(clause = "DELETE_IND='N'")
	private Set<VehicleAvailTime> vehicleAvailTime;
		
	public Vehicle(int userId){super(userId);}

	public Long getVehicleId() {
		return VehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		VehicleId = vehicleId;
	}

	public VehicleType getVehicleType() {
		return VehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		VehicleType = vehicleType;
	}

	public String getVehicleRegNo() {
		return VehicleRegNo;
	}

	public void setVehicleRegNo(String vehicleRegNo) {
		VehicleRegNo = vehicleRegNo;
	}

	public Location getDepotLocation() {
		return DepotLocation;
	}

	public void setDepotLocation(Location depotLocation) {
		DepotLocation = depotLocation;
	}

	public Short getLSPID() {
		return LSPID;
	}

	public void setLSPID(Short lSPID) {
		LSPID = lSPID;
	}

	public Set<VehicleAvailTime> getVehicleAvailTime() {
		return vehicleAvailTime;
	}

	public void setVehicleAvailTime(Set<VehicleAvailTime> vehicleAvailTime) {
		this.vehicleAvailTime = vehicleAvailTime;
	}
  
	
	
}
