package co.yedam.movie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();

		// 1.parameter 추출
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");

//		// 2.유효성 체크
//		if (userId.isEmpty() || userPw.isEmpty()) {
//			RequestDispatcher rd = request.getRequestDispatcher("");
//			rd.forward(request, response);
//			return;
//		}else {
//			
//		}

		UserVO vo = new UserVO();
		UserDAO dao = new UserDAO();
		
		//vo = Integer.parseInt(dao.loginUser(userId, userPw));
		vo.setUserId(userId);
		vo.setUserPw(userPw);

//		HttpSession session = request.getSession();
//		session.setAttribute("isLogOn", true);
//		session.setAttribute("login.id", userId);
//		session.setAttribute("login.pwd", userPw);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
