package farm.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import farm.dao.FarmDao;
import farm.domain.Farm;


/**
 * Servlet implementation class UserServlet
 * Modified by Thomas Sobczak
 */

public class FarmServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FarmServletRead() {
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
		Farm farm = null;
		FarmDao farmDao = new FarmDao();
		
		try {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
			farm = farmDao.findByUsername(request.getParameter("farm_id"));
=======
			farm = farmDao.findByFarm_id(request.getParameter("farm_id"));
>>>>>>> Stashed changes
=======
			farm = farmDao.findByFarm_id(request.getParameter("farm_id"));
>>>>>>> Stashed changes
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(farm.getFarm_id()!=null){
					//System.out.println(farm);
					request.setAttribute("farm", farm);
					request.getRequestDispatcher("/jsps/farm/farm_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "Farm not found");
			request.getRequestDispatcher("/jsps/farm/farm_read_output.jsp").forward(request, response);
		}
	}
}



