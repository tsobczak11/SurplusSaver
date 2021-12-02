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
 */

public class OrdersServletDelete extends HttpServlet {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     * Modified by Thomas Sobczak
//     */
//    public OrdersServletDelete() {
//        super();
//    }
//    
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doPost(request,response);
//	}
//	
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String method = request.getParameter("method");
//		OrdersDao entity1Dao = new OrdersDao();
//		Entity1 entity1 = null;
//		if(method.equals("search"))
//		{
//			try {
//				entity1 = entity1Dao.findByOrder_id(request.getParameter("username"));
//			} catch (ClassNotFoundException e1) {
//				e1.printStackTrace();
//			} catch (InstantiationException e1) {
//				e1.printStackTrace();
//			} catch (IllegalAccessException e1) {
//				e1.printStackTrace();
//			}
//		
//			if(entity1.getUsername()!=null){
//						System.out.println(entity1);
//						request.setAttribute("entity1", entity1);
//						request.getRequestDispatcher("/jsps/entity1/entity1_delete_output.jsp").forward(request, response);			
//				}
//				else{
//				request.setAttribute("msg", "Entity not found");
//				request.getRequestDispatcher("/jsps/entity1/entity1_read_output.jsp").forward(request, response);
//			}
//		}
//		else if(method.equals("delete"))
//		{	
//			try {
//				entity1Dao.delete(request.getParameter("username"));
//			} catch (ClassNotFoundException e1) {
//				e1.printStackTrace();
//			} catch (InstantiationException e1) {
//				e1.printStackTrace();
//			} catch (IllegalAccessException e1) {
//				e1.printStackTrace();
//			}
//			request.setAttribute("msg", "Entity Deleted");
//			request.getRequestDispatcher("/jsps/entity1/entity1_read_output.jsp").forward(request, response);
//		}
//	}
=======
=======
>>>>>>> Stashed changes
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * Modified by Thomas Sobczak
     */
    public OrdersServletDelete() {
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
		OrdersDao ordersDao = new OrdersDao();
		Orders orders = null;
		if(method.equals("search"))
		{
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
						System.out.println(orders);
						request.setAttribute("orders", orders);
						request.getRequestDispatcher("/jsps/order/order_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("msg", "Order not found");
				request.getRequestDispatcher("/jsps/order/order_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				ordersDao.delete(request.getParameter("order_id"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Order Deleted");
			request.getRequestDispatcher("/jsps/order/order_read_output.jsp").forward(request, response);
		}
	}
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
}



