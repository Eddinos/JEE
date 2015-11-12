package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import comm.UserModel;

/**
 * Servlet implementation class WatcherAuthServlet
 */
@WebServlet("/WatcherAuth")
public class WatcherAuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WatcherAuthServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
	    
		String login = request.getParameter("login");
		String pwd = request.getParameter("pwd");
		
		UserModel user = new UserModel(login, pwd);
		System.out.println(user);

		JSONObject JSonUSer = new JSONObject();
		JSonUSer.put("login", login);
		JSonUSer.put("validAuth", "true");
		JSonUSer.put("role", "ADMIN");
		
		
		
	}

}
