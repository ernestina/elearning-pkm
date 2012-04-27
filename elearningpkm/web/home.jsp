<%-- 
    Document   : index
    Created on : Mar 13, 2012, 1:25:22 AM
    Author     : Accio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%String logedUser = (String) session.getAttribute("username");%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Elearning:LMS Community</title>
    </head>
    <body>
        <table width="1024" border="0" align="center" cellspacing="0" bordercolor="#CCCCCC">
            <tr>
                <td height="124"><img src="logo2.png" width="1024" height="150"></td>
            </tr>
            <tr>
                <td height="124" align="center" valign="top"><table width="1024" border="0" align="center" cellspacing="0">
                        <tr>
                            <td width="226" height="441" align="center" valign="top"><table width="224" border="1" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td><form name="form1" method="post" action="login">
                                                <table width="222" border="0">
                                                    <tr>
                                                        <td colspan="3" bgcolor="#0066FF">Login</td>
                                                    </tr>
                                                    <tr>
                                                        <td width="59">username</td>
                                                        <td colspan="2"><label>
                                                                <input type="text" name="username">
                                                            </label></td>
                                                    </tr>
                                                    <tr>
                                                        <td>password</td>
                                                        <td colspan="2"><label>
                                                                <input type="text" name="password">
                                                            </label></td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td width="107">&nbsp;</td>
                                                        <td width="40"><input type="submit" name="Submit" value="Go!"></td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="3"><label>
                                                                <div align="right"><em>click here to register... </em></div>
                                                            </label></td>
                                                    </tr></form>
                                </table>                            </td>
                        </tr>
                    </table>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p></td>
                <td width="8"><p>&nbsp;</p>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>                </td>
                <td width="550" align="center" valign="top"><table width="550" border="0">
                        <tr>
                            <td width="533"><% if (logedUser != null) {%><%="Selamat datang....  " + logedUser%><%}%></td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                        </tr>
                    </table></td>
                <td width="8">&nbsp;</td>
                <td width="226" align="right" valign="top"><table width="226" border="0" align="center">
                        <tr>
                            <td><table width="248" border="1" align="right" cellspacing="0">
                                    <tr>
                                        <td bgcolor="#3C6CFF">Komentar</td>
                                    </tr>
                                    <tr>
                                        <td>&nbsp;</td>
                                    </tr>
                                </table></td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                        </tr>
                    </table></td>
            </tr>
        </table>
        </td>
</tr>
</table>
</body>
</html>
