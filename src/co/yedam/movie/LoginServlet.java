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

	protected void doGet(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws ServletException, IOException {

		// 기본 설정
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");

		//PrintWriter out = response.getWriter();

		// request에 담겨있는 값을 서블릿 변수에 담기.
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");

		UserDAO dao = new UserDAO();
		UserVO vo = new UserVO();

		// VO클래스에 앞단에서 가져온 값을 세팅함.
		vo.setUserId(userId);
		vo.setUserPw(userPw);
	

		// 앞쪽 vo: 메소드로부터 리턴타입 뒷쪽: 메소드의 인자값
		vo = dao.loginUser(vo);

		// db에서 가지고 온 값을 저장
		 String dbId = vo.getUserId();
		 String dbPw = vo.getUserPw();

		// 로그인 일치 검사
		int r = -1;
		if (userId == dbId && userPw == dbPw) {
			r = 1;
			session.setAttribute("sessionId", dbId);
		} else {
			r = 0;
		}
		
		System.out.println(r);
		
		response.getWriter().println(r);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
