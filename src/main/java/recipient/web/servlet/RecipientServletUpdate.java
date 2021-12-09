package recipient.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import recipient.dao.RecipientDao;
import recipient.domain.Recipient;

/**
 * Servlet implementation class UserServlet
 */

public class RecipientServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RecipientServletUpdate() {
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

		String method = request.getParameter("method");
		RecipientDao recipientDao = new RecipientDao();
		Recipient recipient = null;

		if(method.equals("search"))
		{
			try {
				recipient = recipientDao.findByRecipient_id(request.getParameter("recipient"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(recipient.getRecipient_id()!=null){
				request.setAttribute("recipient", recipient);
				request.getRequestDispatcher("/jsps/recipient/recipient_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "Recipient not found");
				request.getRequestDispatcher("/jsps/recipient/recipient_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Recipient form = new Recipient();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setRecipient_id(info.get(0));
			form.setRecipient_first_name(info.get(1));
			form.setRecipient_last_name(info.get(2));
			form.setRecipient_location(info.get(3));
			form.setRecipient_email(info.get(4));

			try {
				recipientDao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Recipient Updated");
			request.getRequestDispatcher("/jsps/recipient/recipient_read_output.jsp").forward(request, response);
		}
	}
}



