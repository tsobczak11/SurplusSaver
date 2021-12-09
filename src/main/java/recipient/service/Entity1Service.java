package category.service;


import category.dao.CategoryDao;
import category.domain.Category;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class Entity1Service {
	private CategoryDao entity1Dao = new CategoryDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Category form) throws CategoryException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Category entity1 = entity1Dao.findByUsername(form.getUsername());
		if(entity1.getUsername()!=null && entity1.getUsername().equals(form.getUsername())) throw new CategoryException("This user name has been registered!");
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
	public void login(Category form) throws CategoryException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Category user = entity1Dao.findByUsername(form.getUsername());
		if(user.getUsername()==null) throw new CategoryException("The user is not in the database");
		
		String password = user.getPassword();
		
		if(password!=null && !password.equals(form.getPassword()))
			throw new CategoryException(" The password is not right");
		
	}
}
