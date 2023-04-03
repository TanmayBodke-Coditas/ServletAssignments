import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class CoockiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		if(request.getCookies() == null){
			out.println("No Cookies");
			Cookie co = new Cookie("ctr", "1");
		}else{
			int noctr = 0;
			Cookie[] allCookies = request.getCookies();

			for (int i = 0; i<allCookies.length; i++){
				if(allCookies[i].getName().equals("ctr")){
					out.println(allCookies[i].getValue());
					noctr = 1;
					break;
				}
			}
			if(noctr ==0){
				Cookie co = new Cookie("ctr", "1");
				response.addCookie(co);
			}
		}
	}

}
