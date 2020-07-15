package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;

//import servlets.RequestDispatcher;
import javax.servlet.RequestDispatcher;

@WebServlet("/AddWaterBody")
public class AddWaterBody extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddWaterBody() 
    {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		// Call function AddWaterBody on Controller and return result
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("nombre");
		String river = request.getParameter("rio");
		String basin = request.getParameter("cuenca");
		String type = request.getParameter("tipo");
		String city = request.getParameter("ciudad");
		String province = request.getParameter("provincia");
		int resultado = Controller.getInstance().addWaterBody(id, name, river, basin, type, city, province);
		request.setAttribute("resultado", resultado);
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/AddWaterBody.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
