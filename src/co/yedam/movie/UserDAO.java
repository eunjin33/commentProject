package co.yedam.movie;

import java.sql.SQLException;

public class UserDAO extends DAO {

	// 회원 업로드
	public UserVO uploadUser(String userId, String userPw, String userNick) {
		connect();
		String sql = "insert into users values(?, ?, ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				UserVO vo = new UserVO();
				vo.setUserId(rs.getString("userId"));
				vo.setUserPw(rs.getString("userPw"));
				vo.setUserNick(rs.getString("userNick"));
			}

			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력");

			UserVO vo = new UserVO();
			vo.setUserId(userId);
			vo.setUserPw(userPw);
			vo.setUserNick(userNick);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}

	// 회원 로그인

	String sql = "select userId form user where userPw";
}
