package transport.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
<<<<<<< Updated upstream
import java.util.Arrays;
=======
>>>>>>> Stashed changes
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import transport.dao.TransportDao;
import transport.domain.Transport;

/**
 * Servlet implementation class UserServlet
 */

public class TransportServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TransportServletUpdate() {
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

<<<<<<< Updated upstream
//		String method = request.getParameter("method");
//		TransportDao entity1dao = new TransportDao();
//		Transport entity1 = null;
//
//		if(method.equals("search"))
//		{
//			try {
//				entity1 = entity1dao.findByShipment_id(request.getParameter("username"));
//			} catch (ClassNotFoundException e1) {
//				e1.printStackTrace();
//			} catch (InstantiationException e1) {
//				e1.printStackTrace();
//			} catch (IllegalAccessException e1) {
//				e1.printStackTrace();
//			}
//
//			if(entity1.getUsername()!=null){
//				request.setAttribute("entity1", entity1);
//				request.getRequestDispatcher("/jsps/entity1/entity1_update_output.jsp").forward(request, response);
//
//			}
//			else{
//				request.setAttribute("msg", "Entity not found");
//				request.getRequestDispatcher("/jsps/entity1/entity1_read_output.jsp").forward(request, response);
//			}
//		}
//		else if(method.equals("update"))
//		{
//			Map<String,String[]> paramMap = request.getParameterMap();
//			Transport form = new Transport();
//			List<String> info = new ArrayList<String>();
//
//			for(String name : paramMap.keySet()) {
//				String[] values = paramMap.get(name);
//				info.add(values[0]);
//			}
//			form.setPassword(info.get(2));
//			form.setEmail(info.get(3));
//			form.setUsername(request.getParameter("username"));
//
//			try {
//				entity1dao.update(form);
//
//			} catch (ClassNotFoundException e1) {
//				e1.printStackTrace();
//			} catch (InstantiationException e1) {
//				e1.printStackTrace();
//			} catch (IllegalAccessException e1) {
//				e1.printStackTrace();
//			}
//			request.setAttribute("msg", "Entity Updated");
//			request.getRequestDispatcher("/jsps/entity1/entity1_read_output.jsp").forward(request, response);
//		}
=======
		String method = request.getParameter("method");
		TransportDao transportdao = new TransportDao();
		Transport transport = null;

		if(method.equals("search"))
		{
			try {
				transport = transportdao.findByShipment_id(request.getParameter("shipment_id"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(transport.getShipment_id()!=null){
				request.setAttribute("transport", transport);
				request.getRequestDispatcher("/jsps/transport/transport_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "transport not found");
				request.getRequestDispatcher("/jsps/transport/transport_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Transport form = new Transport();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setShipment_id(info.get(1));
			form.setOrder_id(info.get(2));
			form.setShipment_date(java.sql.Date.valueOf(info.get(3)));	

			try {
				transportdao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "transport Updated");
			request.getRequestDispatcher("/jsps/transport/transport_read_output.jsp").forward(request, response);
		}
>>>>>>> Stashed changes
	}
}



