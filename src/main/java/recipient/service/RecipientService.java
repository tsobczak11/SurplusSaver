package recipient.service;


import recipient.dao.RecipientDao;
import recipient.domain.Recipient;

/**
 * logic functions for recipient
 * @author Matthew Alvero
 *
 */
public class RecipientService {
	private RecipientDao recipientDao = new RecipientDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Recipient form) throws RecipientException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Recipient recipient = recipientDao.findByRecipient_id(form.getRecipient_id());
		if(recipient.getRecipient_id()!=null && recipient.getRecipient_id().equals(form.getRecipient_id())) throw new RecipientException("This recipient has been registered!");
		recipientDao.add(form);
	}
}
