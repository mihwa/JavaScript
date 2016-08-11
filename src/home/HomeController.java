package home;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */
@WebServlet({"/home.do"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("서블릿 입장..");
		String servletPath = request.getServletPath();
		System.out.println("서블릿 경로"+servletPath);
		String path = servletPath.split("/")[1];
		String view = path.substring(0, path.indexOf("."));
		System.out.println("가야할 경로 : "+view);
		RequestDispatcher dis = 
				request.getRequestDispatcher("/WEB-INF/global/"+view+".jsp");
		dis.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}