package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
//	@Override
//	protected void doGet(HttpServletRequest request,
//			HttpServletResponse response) throws ServletException, IOException{
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Welcome Amigo</title");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("My first Servlet");
//		out.println("</body>");
//		out.println("</html>");
//}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
		
		
		String password = request.getParameter("password");
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, reponse);
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
		 request.setAttribute("name", request.getParameter("name")); 
		 request.setAttribute("password", request.getParameter("password")); 

		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, reponse);
	}

//	private LoginService userValidationService = new LoginService();
//	//private TodoService todoService = new TodoService();
//
//	protected void doGet(HttpServletRequest request,
//			HttpServletResponse response) throws ServletException, IOException {
//		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(
//				request, response);
//	}
//
//	protected void doPost(HttpServletRequest request,
//			HttpServletResponse response) throws ServletException, IOException {
//		String name = request.getParameter("name");
//		String password = request.getParameter("password");
//
//		boolean isUserValid = userValidationService.isUserValid(name, password);
//
//		if (isUserValid) {
//			request.getSession().setAttribute("name", name);
//			response.sendRedirect("/list-todos.do");
//		} else {
//			request.setAttribute("errorMessage", "Invalid Credentials!");
//			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(
//					request, response);
//		}
//	}

}