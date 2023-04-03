import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/score")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.println("Hello from Servlet");
		int total = 5;
		int marks = 0;
		if(request.getParameter("q1").equals("q1a2")){
			marks++;
		}
		if(request.getParameter("q2").equals("q2a1")){
			marks++;
		}
		if(request.getParameter("q3").equals("q3a3")){
			marks++;
		}
		if(request.getParameter("q4").equals("q4a4")){
			marks++;
		}
		if(request.getParameter("q5").equals("q5a1")){
			marks++;
		}

		out.println("Right answers ::"+ marks+"<br>");
		out.println("Wrong answers ::"+ (total-marks));
	}

}
