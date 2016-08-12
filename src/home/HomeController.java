package home;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.Command;
import global.DispatcherServlet;
import global.Separator;

@WebServlet("/home.do")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("===HomeController===");
		Command c = Separator.init(request,response);
		DispatcherServlet.send(request, response, c);
	}


}