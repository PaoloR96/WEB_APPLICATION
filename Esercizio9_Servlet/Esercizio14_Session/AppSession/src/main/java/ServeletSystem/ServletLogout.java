package ServeletSystem;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLogout
 */
@WebServlet("/Logout")
public class ServletLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		System.out.println("Session before invalidate: "+ request.getSession(false));
		// Invalidate the session.
        request.getSession(false).invalidate();
        System.out.println("Session after invalidate: "+ request.getSession(false));
        out.println("Thank you! You are successfully logged out.");
	}

}
