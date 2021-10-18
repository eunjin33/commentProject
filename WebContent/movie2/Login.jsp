<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>Login</title>
</head>

<body>
    <form name="Longin" action="LogInreal.jsp" method="post">
        <center>
            <table border=1>
                <tr>
                    <td colspan="2" align=center>
                        <b>
                            <font size=5>LogIn</font>
                        </b>
                    </td>
                </tr>
                <tr>
                    <td>아이디 : </td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>비밀번호 : </td>
                    <td><input type="password" name="pass"></td>
                </tr>
                <tr>
                    <td colspan="2" align=center>
                        <input type="submit" value="Login">
                        <a href="Join.jsp">회원가입</a>
                    </td>
                </tr>

            </table>
        </center>
    </form>
</body>

</html>