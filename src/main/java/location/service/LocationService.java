package location.service;


import java.util.List;

import location.dao.LocationDao;
import location.domain.Location;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 * Modified by Ryan Thommes
 *
 */
public class LocationService {
	private LocationDao locationDao = new LocationDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Location form) throws LocationException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Location entity1 = locationDao.findByLocation_id(form.getLocation_id());
		if(entity1.getLocation_id()!=null && entity1.getLocation_id().equals(form.getLocation_id())) throw new LocationException("This farm_id name has been registered before!");
		locationDao.add(form);
	}

}
