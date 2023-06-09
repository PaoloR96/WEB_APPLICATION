package ServletOperations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		System.out.println("Session before invalidate: "+ request.getSession(false));
		
		// Invalidate the session.
        request.getSession(false).invalidate();
        Cookie c= new Cookie("user", "");
        c.setMaxAge(0);
        response.addCookie(c);
        response.sendRedirect("Home.html");
	}


}
