package farm.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

public class FarmServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FarmServletUpdate() {
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
		FarmDao farmdao = new FarmDao();
		Farm farm = null;

		if(method.equals("search"))
		{
			try {
				farm = farmdao.findByFarm_id(request.getParameter("farm_id"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(farm.getFarm_id()!=null){
				request.setAttribute("farm", farm);
				request.getRequestDispatcher("/jsps/farm/farm_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "farm not found");
				request.getRequestDispatcher("/jsps/farm/farm_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Farm form = new Farm();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setFarm_id(info.get(1));
			form.setOrder_id(info.get(2));
			form.setShipment_id(request.getParameter("shipment_id"));

			try {
				farmdao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "farm Updated");
			request.getRequestDispatcher("/jsps/farm/farm_read_output.jsp").forward(request, response);
		}
	}
}



