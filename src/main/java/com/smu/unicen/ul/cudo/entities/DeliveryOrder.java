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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TBL_DELIVERY_ORDER", schema="CUDO")
public class DeliveryOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DELIVERY_ORDER_ID")
    private Long DeliveryOrderId;
	
	@JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
	@OneToOne( cascade={CascadeType.MERGE}, fetch = FetchType.EAGER)
    private Order Order;
	
	@JoinColumn(name = "DELIVERY_PLAN_ID", referencedColumnName = "DELIVERY_PLAN_ID")
	@ManyToOne( cascade={CascadeType.ALL}, fetch = FetchType.EAGER)
	private DeliveryPlan Delivery;
	
	@Column(name="BOOKING_ID")
    private Long BookingId;
	
	@Column(name="SLOT_ID")
    private Long SlotId;
	
	@Column(name="SERVICE_TIME")
    private Long ServiceTime;
	
	@Column(name="WAITING_TIME")
    private Long WaitingTime;
	
	@Column(name="ARRIVAL_BY")
	@Temporal (TemporalType.TIMESTAMP)
    private Date ArrivalBy;

	public Long getDeliveryOrderId() {
		return DeliveryOrderId;
	}

	public void setDeliveryOrderId(Long deliveryOrderId) {
		DeliveryOrderId = deliveryOrderId;
	}

	public Order getOrder() {
		return Order;
	}

	public void setOrder(Order order) {
		Order = order;
	}

	public DeliveryPlan getDelivery() {
		return Delivery;
	}

	public void setDelivery(DeliveryPlan delivery) {
		Delivery = delivery;
	}

	public Long getBookingId() {
		return BookingId;
	}

	public void setBookingId(Long bookingId) {
		BookingId = bookingId;
	}

	public Long getSlotId() {
		return SlotId;
	}

	public void setSlotId(Long slotId) {
		SlotId = slotId;
	}

	public Long getServiceTime() {
		return ServiceTime;
	}

	public void setServiceTime(Long serviceTime) {
		ServiceTime = serviceTime;
	}

	public Long getWaitingTime() {
		return WaitingTime;
	}

	public void setWaitingTime(Long waitingTime) {
		WaitingTime = waitingTime;
	}

	public Date getArrivalBy() {
		return ArrivalBy;
	}

	public void setArrivalBy(Date arrivalBy) {
		ArrivalBy = arrivalBy;
	}
	
	
}
