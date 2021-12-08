package farm.service;


import java.util.List;

import farm.dao.FarmDao;
import farm.domain.Farm;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 * Modified by Thomas Sobczak
 *
 */
public class FarmService {
	private FarmDao farmDao = new FarmDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Farm form) throws FarmException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Farm entity1 = farmDao.findByFarm_id(form.getFarm_id());
		if(entity1.getFarm_id()!=null && entity1.getFarm_id().equals(form.getFarm_id())) throw new FarmException("This farm_id name has been registered before!");
		farmDao.add(form);
	}
	public List<Object> findOrderDate() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return farmDao.findOrderDate();
		
	}

}
