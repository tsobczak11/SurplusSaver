package transport.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import transport.dao.TransportDao;
import transport.domain.Transport;


/**
 * Servlet implementation class UserServlet
 */

public class TransportServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransportServletRead() {
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
		Transport transport = null;
		TransportDao transportDao = new TransportDao();
		
		try {
			transport = transportDao.findByShipment_id(request.getParameter("shipment_id"));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(transport.getShipment_id()!=null){
					System.out.println(transport);
					request.setAttribute("transport", transport);
					request.getRequestDispatcher("/jsps/transport/transport_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "Transport not found");
			request.getRequestDispatcher("/jsps/transport/transport_read_output.jsp").forward(request, response);
		}
	}
}



