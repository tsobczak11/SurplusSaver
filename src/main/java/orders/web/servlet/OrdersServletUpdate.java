package orders.web.servlet;

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

import orders.dao.OrdersDao;
import orders.domain.Orders;

/**
 * Servlet implementation class UserServlet
 * Modified by Thomas Sobczak
 */

public class OrdersServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrdersServletUpdate() {
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
//
//		String method = request.getParameter("method");
//		OrdersDao entity1dao = new OrdersDao();
//		Orders entity1 = null;
//
//		if(method.equals("search"))
//		{
//			try {
//				entity1 = entity1dao.findByOrder_id(request.getParameter("username"));
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
//			Entity1 form = new Entity1();
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
		OrdersDao ordersdao = new OrdersDao();
		Orders orders = null;

		if(method.equals("search"))
		{
			try {
				orders = ordersdao.findByOrder_id(request.getParameter("order_id"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(orders.getOrder_id()!=null){
				request.setAttribute("orders", orders);
				request.getRequestDispatcher("/jsps/order/order_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "order not found");
				request.getRequestDispatcher("/jsps/order/order_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Orders form = new Orders();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setOrder_id(info.get(1));
			form.setRecipient_id(info.get(2));
			form.setOrder_date(java.sql.Date.valueOf(info.get(3)));	

			try {
				ordersdao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "order Updated");
			request.getRequestDispatcher("/jsps/order/order_read_output.jsp").forward(request, response);
		}
>>>>>>> Stashed changes
	}
}



