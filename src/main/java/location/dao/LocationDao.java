package location.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;

import location.domain.Location;
import transport.domain.Transport;

/**
 * DDL functions performed in database
 * Modified by Ryan Thommes
 */
public class LocationDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "surplus_saver"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "12345"; //TODO change password

	public Location findByLocation_id(String location_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Location location = new Location();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
		    String sql = "select * from location where location_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,location_id_p);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	String location_id = resultSet.getString("location_id");
		    	if(location_id.equals(location_id_p)){
		    		location.setLocation_id(resultSet.getString("location_id"));
		    		location.setStreet(resultSet.getString("street"));
		    		location.setCity(resultSet.getString("city"));
		    		location.setState(resultSet.getString("state"));
		    		location.setCountry(resultSet.getString("country"));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return location;
	}	
	
	/**
	 * insert farm
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Location form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
			
			String sql = "insert into location values(?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setString(1,form.getLocation_id());
		    preparestatement.setString(2,form.getStreet());
		    preparestatement.setString(3,form.getCity());
		    preparestatement.setString(4,form.getState());
		    preparestatement.setString(5,form.getCountry());
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
	
	public void update(Location form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
			
			String sql = "UPDATE farm SET location_id = ?, street = ?, city = ?, state = ?, country = ? where location_id = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setString(1,form.getLocation_id());
		    preparestatement.setString(2,form.getStreet());
		    preparestatement.setString(3,form.getCity());
		    preparestatement.setString(4,form.getState());
		    preparestatement.setString(5,form.getCountry());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param farm_id_p
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	
	public void delete(String location_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
			
			String sql = "delete from location where location_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,location_id_p);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
