package recipient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import recipient.domain.Recipient;

/**
 * DDL functions performed in database
 */
public class RecipientDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "root"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "#427252021Ma"; //TODO change password

	public Recipient findByRecipient_id(String recipient_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Recipient recipient = new Recipient();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
		    String sql = "select * from recipient where recipient_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,recipient_id_p);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	String recipient_id = resultSet.getString("recipient_id");
		    	if(recipient_id.equals(recipient_id_p)){
		    		recipient.setRecipient_id(resultSet.getString("recipient_id"));
		    		recipient.setRecipient_first_name(resultSet.getString("recipient_first_name"));
		    		recipient.setRecipient_last_name(resultSet.getString("recipient_last_name"));	
		    		recipient.setRecipient_location(resultSet.getString("recipient_location"));
		    		recipient.setRecipient_email(resultSet.getString("recipient_email"));
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return recipient;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Recipient form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
			
			String sql = "insert into recipient (recipient_id, recipient_first_name, recipient_last_name, recipient_location, recipient_email) values(?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getRecipient_id());
		    preparestatement.setString(2,form.getRecipient_first_name());
		    preparestatement.setString(3,form.getRecipient_last_name());
		    preparestatement.setString(4, form.getRecipient_location());
		    preparestatement.setString(5, form.getRecipient_email());
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
	public void update(Recipient form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
			
			String sql = "UPDATE recipient SET recipient_first_name = ?, recipient_last_name = ?, recipient_location = ?, recipient_email = ? where recipient_id = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getRecipient_first_name());
			preparestatement.setString(2,form.getRecipient_last_name());
		    preparestatement.setString(3,form.getRecipient_location());
		    preparestatement.setString(4,form.getRecipient_email());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param recipient_id
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void delete(String recipient_id) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
			
			String sql = "delete from recipient where recipient_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,recipient_id);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
