package entity1.service;


import entity1.dao.TransportDao;
import entity1.domain.Orders;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class TransportService {
	private TransportDao entity1Dao = new TransportDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Orders form) throws Entity1Exception, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Orders entity1 = entity1Dao.findByUsername(form.getUsername());
		if(entity1.getUsername()!=null && entity1.getUsername().equals(form.getUsername())) throw new Entity1Exception("This user name has been registered!");
		entity1Dao.add(form);
	}
	/**
	 * Login function
	 * @param form
	 * @return
	 * @throws UserException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void login(Orders form) throws Entity1Exception, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Orders user = entity1Dao.findByUsername(form.getUsername());
		if(user.getUsername()==null) throw new Entity1Exception("The user is not in the database");
		
		String password = user.getPassword();
		
		if(password!=null && !password.equals(form.getPassword()))
			throw new Entity1Exception(" The password is not right");
		
	}
}
