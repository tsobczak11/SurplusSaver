package transport.domain;

import java.sql.Date;

/**
 * User object
 * 
 * @author Aayush Makharia
 * modified by Thomas Sobczak
 * 
 */
public class Transport {
	/*
	 * Correspond to the user table
	 */
	
	private String shipment_id;
	/**
	 * @return the shipment_id
	 */
	public String getShipment_id() {
		return shipment_id;
	}
	/**
	 * @param shipment_id the shipment_id to set
	 */
	public void setShipment_id(String shipment_id) {
		this.shipment_id = shipment_id;
	}
	/**
	 * @return the order_id
	 */
	public String getOrder_id() {
		return order_id;
	}
	/**
	 * @param order_id the order_id to set
	 */
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	/**
	 * @return the shipment_date
	 */
	public Date getShipment_date() {
		return shipment_date;
	}
	/**
	 * @param shipment_date the shipment_date to set
	 */
	public void setShipment_date(Date shipment_date) {
		this.shipment_date = shipment_date;
	}
	private String order_id; 
	private Date shipment_date;
	
	
	
}
