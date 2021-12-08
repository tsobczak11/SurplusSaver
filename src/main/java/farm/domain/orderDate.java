package farm.domain;

import java.sql.Date;

public class orderDate {
	
	private String order_id;
	private Date shipment_date;
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

}
