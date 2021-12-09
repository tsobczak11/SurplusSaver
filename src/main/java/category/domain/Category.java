package category.domain;

/**
 * Category object
 * 
 * @author Matthew Alvero
 * 
 */
public class Category {
	/*
	 * Correspond to the category table from physical design
	 */
	
	private String category_id;
	private String category_name; 
	private String category_description;
	
	/**
	 * @return the category_id
	 */
	public String getCategory_id() {
		return category_id;
	}
	/**
	 * @param category_id the category_id to set
	 */
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	/**
	 * @return the category_name
	 */
	public String getCategory_name() {
		return category_name;
	}
	/**
	 * @param category_name the category_name to set
	 */
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	/**
	 * @return the category_description
	 */
	public String getCategory_description() {
		return category_description;
	}
	/**
	 * @param category_description the category_description to set
	 */
	public void setCategory_description(String category_description) {
		this.category_description = category_description;
	}

	

}
