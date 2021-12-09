package quantity.service;


import quantity.dao.QuantityDao;
import quantity.domain.Quantity;

/**
 * logic functions such as register, login
 * @author Ramzi Rimawi
 *
 *
public class QuantityService {
	private QuantityDao entity1Dao = new QuantityDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 *
	public void create(Quantity form) throws QuantityException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Quantity entity1 = entity1Dao.findByQuantity(form.getUsername());
		if(entity1.getUsername()!=null && entity1.getUsername().equals(form.getUsername())) throw new QuantityException("This user name has been registered!");
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
	 *
	public void login(Quantity form) throws QuantityException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Quantity user = entity1Dao.findByQuantity(form.getUsername());
		if(user.getUsername()==null) throw new QuantityException("The user is not in the database");
		
		String password = user.getPassword();
		
		if(password!=null && !password.equals(form.getPassword()))
			throw new QuantityException(" The password is not right");
		
	}
}
*/