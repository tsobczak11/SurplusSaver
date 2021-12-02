package farm.domain;

/**
 * Farm object
 * 
 * @author Aayush Makharia
 * Modified by Thomas Sobczak
 * 
 */
public class Farm {
	/*
	 * Correspond to the user table
	 */
	
	private String farm_id;
	private String order_id; 
	private String shipment_id;
	/**
	 * @return the farm_id
	 */
	public String getFarm_id() {
		return farm_id;
	}
	/**
	 * @param farm_id the farm_id to set
	 */
	public void setFarm_id(String farm_id) {
		this.farm_id = farm_id;
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
	
	

}
