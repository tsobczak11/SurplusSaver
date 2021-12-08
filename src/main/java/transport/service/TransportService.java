package transport.service;


import java.util.List;

import transport.dao.TransportDao;
import transport.domain.Transport;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 * modified by Thomas Sobczak
 *
 */
public class TransportService {
	private TransportDao transportDao = new TransportDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Transport form) throws TransportException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Transport entity1 = transportDao.findByShipment_id(form.getShipment_id());
		if(entity1.getShipment_id()!=null && entity1.getShipment_id().equals(form.getShipment_id())) throw new TransportException("This transport name has been registered already!");
		transportDao.add(form);
	}
	
	public List<Object> findNumOrders() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return transportDao.findNumOrders();
		
	}
}
