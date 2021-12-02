package orders.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import orders.domain.Orders;

/**
 * DDL functions performed in database
 * Modified by Thomas Sobczak
 */
public class OrdersDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "surplus_saver"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "12345"; //TODO change password

	public Orders findByOrder_id(String order_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Orders orders = new Orders();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
		    String sql = "select * from orders where order_id=?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,order_id_p);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	String order_id = resultSet.getString("order_id");
		    	if(order_id.equals(order_id_p)){
		    		orders.setOrder_id(resultSet.getString("order_id"));
		    		orders.setRecipient_id(resultSet.getString("recipient_id"));
		    		orders.setOrder_date(java.sql.Date.valueOf(resultSet.getString("order_date")));		
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return orders;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(Orders form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
			
			String sql = "insert into orders values(?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getOrder_id());
		    preparestatement.setString(2,form.getRecipient_id());
		    preparestatement.setDate(3,form.getOrder_date());
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
	public void update(Orders form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
			
			String sql = "UPDATE orders SET recipient_id = ?, order_date = ? where order_id = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,form.getRecipient_id());
		    preparestatement.setDate(2,form.getOrder_date());
		    preparestatement.setString(3,form.getOrder_id());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param order_id_p
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void delete(String order_id_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/surplus_saver", MySQL_user, MySQL_password);
			
			String sql = "delete from orders where order_id = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setString(1,order_id_p);
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
