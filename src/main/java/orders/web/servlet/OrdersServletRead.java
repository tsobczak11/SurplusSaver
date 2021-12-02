package orders.web.servlet;

import java.io.IOException;


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

public class OrdersServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdersServletRead() {
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
		Orders orders = null;
		OrdersDao ordersDao = new OrdersDao();
		
		try {
			orders = ordersDao.findByOrder_id(request.getParameter("order_id"));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(orders.getOrder_id()!=null){
					//System.out.println(orders);
					request.setAttribute("orders", orders);
					request.getRequestDispatcher("/jsps/order/order_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "Orders not found");
			request.getRequestDispatcher("/jsps/order/order_read_output.jsp").forward(request, response);
		}
	}
}



