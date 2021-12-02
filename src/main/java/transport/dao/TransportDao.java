package transport.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import transport.domain.Transport;

/**
 * DDL functions performed in database
 * modified by Thomas Sobczak
 */
public class TransportDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "surplus_saver"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "12345"; //TODO change password

	public Transport findByShipment_id(String shipment_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Transport transport = new Transport();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
		    String sql = "select * from transport where shipment_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,shipment_id_p);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	String shipment_id = resultSet.getString("shipment_id");
		    	if(shipment_id.equals(shipment_id_p)){
		    		transport.setShipment_id(resultSet.getString("shipment_id"));
		    		transport.setOrder_id(resultSet.getString("order_id"));
		    		transport.setShipment_date(java.sql.Date.valueOf(resultSet.getString("shipment_date")));		
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return transport;
	}	
	
	/**
	 * insert transport
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Transport form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
			
			String sql = "insert into transport values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getShipment_id());
		    preparestatement.setString(2,form.getOrder_id());
		    preparestatement.setDate(3,form.getShipment_date());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param form
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void update(Transport form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
			
			String sql = "UPDATE transport SET order_id = ?, shipment_date = ? where shipment_id = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getOrder_id());
		    preparestatement.setDate(2,form.getShipment_date());
		    preparestatement.setString(3,form.getShipment_id());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
//	/**
//	 * @param username
//	 * @throws ClassNotFoundException
//	 * @throws InstantiationException
//	 * @throws IllegalAccessException
//	 */
	public void delete(String shipment_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
			
			String sql = "delete from transport where shipment_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,shipment_id_p);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
