package recipient.domain;

/**
 * Recipient object
 * 
 * @author Matthew Alvero
 * 
 */
public class Recipient {
	/*
	 * Correspond to the recipient table
	 */
	
	private String recipient_id;
	private String recipient_first_name; 
	private String recipient_last_name;
	private String recipient_location;
	private String recipient_email;
	
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
	 * @return the recipient_first_name
	 */
	public String getRecipient_first_name() {
		return recipient_first_name;
	}
	/**
	 * @param recipient_first_name the recipient_first_name to set
	 */
	public void setRecipient_first_name(String recipient_first_name) {
		this.recipient_first_name = recipient_first_name;
	}
	/**
	 * @return the recipient_last_name
	 */
	public String getRecipient_last_name() {
		return recipient_last_name;
	}
	/**
	 * @param recipient_last_name the recipient_last_name to set
	 */
	public void setRecipient_last_name(String recipient_last_name) {
		this.recipient_last_name = recipient_last_name;
	}
	/**
	 * @return the recipient_location
	 */
	public String getRecipient_location() {
		return recipient_location;
	}
	/**
	 * @param recipient_location the recipient_location to set
	 */
	public void setRecipient_location(String recipient_location) {
		this.recipient_location = recipient_location;
	}
	/**
	 * @return the recipient_email
	 */
	public String getRecipient_email() {
		return recipient_email;
	}
	/**
	 * @param recipient_email the recipient_email to set
	 */
	public void setRecipient_email(String recipient_email) {
		this.recipient_email = recipient_email;
	}
	
	
}
