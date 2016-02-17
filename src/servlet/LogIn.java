package servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Log
 */
@WebServlet("/Log")
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("username");
	    String pass = request.getParameter("password");
	    RequestDispatcher requestDispatcher = null;
	    if(name.equals("minhqlrt") && pass.equals("password")){
	    	response.sendRedirect("home.jsp");
	    }else if(name.equals("") || pass.equals("")){
	    	request.setAttribute("loginResult", "empty");
	        requestDispatcher = request.getRequestDispatcher("index.jsp");
	        requestDispatcher.forward(request, response);
	    }else{
	    	request.setAttribute("loginResult", "incorrect");
	        requestDispatcher = request.getRequestDispatcher("index.jsp");
	        requestDispatcher.forward(request, response);
	    }
	}
}


