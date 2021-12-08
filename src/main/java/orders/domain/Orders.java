package orders.domain;

import java.sql.Date;

/**
 * Orders object
 * 
 * @author Aayush Makharia
 * Modified by Thomas Sobczak
 * 
 */
public class Orders {
	/*
	 * Correspond to the user table
	 */
	
	private String order_id;
	private String recipient_id; 
	private Date order_date;
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
	 * @return the recipient_id
	 */
	public String getRecipient_id() {
		return recipient_id;
	}
	/**
	 * @param recipient_id the recipient_id to set
	 */
	public void setRecipient_id(String recipient_id) {
		this.recipient_id = recipient_id;
	}
	/**
	 * @return the order_date
	 */
	public Date getOrder_date() {
		return order_date;
	}
	/**
	 * @param order_date the order_date to set
	 */
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	
	
	
}
