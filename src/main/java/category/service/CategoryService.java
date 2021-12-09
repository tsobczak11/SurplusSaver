package category.service;


import category.dao.CategoryDao;
import category.domain.Category;

/**
 * logic functions for category
 * @author Matthew Alvero
 *
 */
public class CategoryService {
	private CategoryDao categoryDao = new CategoryDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Category form) throws CategoryException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Category entity1 = categoryDao.findByCategory_id(form.getCategory_id());
		if(entity1.getCategory_id()!=null && entity1.getCategory_id().equals(form.getCategory_id())) throw new CategoryException("This category_id has been registered!");
		categoryDao.add(form);
	}
}
