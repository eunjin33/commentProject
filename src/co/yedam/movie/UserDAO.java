package co.yedam.movie;

import java.sql.SQLException;

public class UserDAO extends DAO {

	// 회원 업로드
	public UserVO insertUser(String userId, String userPw, String UserNick) {
		connect();
		String sql = "insert into users (user_id, user_pw, user_nick)\r\n" + "values(?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, userId);
			psmt.setString(2, userPw);
			psmt.setString(3, UserNick);

			int r = psmt.executeUpdate();
			System.out.println(r + "입력됨.");

			UserVO vo = new UserVO();
			vo.setUserId(userId);
			vo.setUserPw(userPw);
			vo.setUserNick(UserNick);
			return vo;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			disconnect();
		}
	}

	// 회원 로그인
//	public UserVO userLogin() {
//		String sql = "select userId form user where userPw";
//
//		return null;
//
//	}

}
