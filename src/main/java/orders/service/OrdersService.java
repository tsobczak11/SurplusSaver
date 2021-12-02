package orders.service;


import orders.dao.OrdersDao;
import orders.domain.Orders;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 * Modified by Thomas Sobczak
 *
 */
public class OrdersService {
	private OrdersDao ordersDao = new OrdersDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Orders form) throws OrdersException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Orders entity1 = ordersDao.findByOrder_id(form.getOrder_id());
		if(entity1.getOrder_id()!=null && entity1.getOrder_id().equals(form.getOrder_id())) throw new OrdersException("This order already exists!");
		ordersDao.add(form);
	}

}
