package recipient.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import recipient.dao.RecipientDao;
import recipient.domain.Recipient;


/**
 * Servlet implementation class UserServlet
 */

public class RecipientServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecipientServletRead() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Recipient recipient = null;
		RecipientDao recipientDao = new RecipientDao();
		
		try {
			recipient = recipientDao.findByRecipient_id(request.getParameter("recipient_id"));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(recipient.getRecipient_id()!=null){
					System.out.println(recipient);
					request.setAttribute("recipient", recipient);
					request.getRequestDispatcher("/jsps/recipient/recipient_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "recipient not found");
			request.getRequestDispatcher("/jsps/recipient/recipient_read_output.jsp").forward(request, response);
		}
	}
}



