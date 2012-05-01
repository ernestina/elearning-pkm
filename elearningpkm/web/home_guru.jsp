<%-- 
    Document   : index
    Created on : Mar 13, 2012, 1:25:22 AM
    Author     : Accio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Elearning:LMS Community</title>
        <style type="text/css">
            <!--
            .style15 {font-size: 12px; font-style: italic; }
            .style16 {font-size: 12px}
            a:link {
                text-decoration: none;
            }
            a:visited {
                text-decoration: none;
            }
            a:hover {
                text-decoration: none;
            }
            a:active {
                text-decoration: none;
            }
            -->
        </style>
        <%String logedUser = (String) session.getAttribute("username");%>
    </head>
    <body>
        <table width="1024" border="0" align="center" cellspacing="0" bordercolor="#CCCCCC">
            <tr>
                <td height="124"><img src="logo2.png" width="1058" height="188">
                    <table width="1053" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <th width="803" bgcolor="#FFFFFF" scope="col"><div align="left"><a href="home_guru.jsp">Home</a> &gt;&gt;</div></th>
                        <th width="80" bgcolor="#FFFFFF" scope="col"><div align="left" class="style15"><% if (logedUser != null) {%><%="Welcome, " + logedUser%><%}%></div></th>
                        <th width="10" bgcolor="#FFFFFF" scope="col"><span class="style16"></span></th>
                        <th width="40" bgcolor="#FFFFFF" scope="col"><span class="style15"><a href="index.jsp">(logout)</a></span></th>
            </tr>
        </table></td>
</tr>
<tr>
    <td height="124" align="center" valign="top"><table width="1038" border="0" align="center" cellspacing="0">
            <tr>
                <td width="226" height="441" align="center" valign="top"><table width="224" border="1" cellpadding="0" cellspacing="0">
                        <tr>
                            <td><form name="form1" method="post" action="login">
                                    <table width="222" border="0">
                                        <tr>
                                            <td width="206" bgcolor="#80BFBF"><strong>MyMenu</strong></td>
                                        </tr>
                                        <tr>
                                            <td><a href="guru_ubah_profil.jsp">Ubah Profil</a> </td>
                                        </tr>
                                        <tr>
                                            <td><a href="admin_manajemen_course.jsp">Manajemen Course</a><a href="admin_manajemen_guru.jsp"></a></td>
                                        </tr>
                                    </table>
                                </form>                    </td>
                        </tr>
                    </table>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p></td>
                <td width="7"><p>&nbsp;</p>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>                </td>
                <td align="center" valign="top"><table width="819" border="0">
                        <tr>
                            <td width="819"><table width="813" border="1" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <th width="809" bgcolor="#80BFBF" scope="col"><div align="left">Daftar Course Aktif </div></th>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                        </tr>
                    </table></td>
            </tr>
            <tr>
                <td><table width="812" border="1" cellpadding="0" cellspacing="0">
                        <tr>
                            <th width="808" bgcolor="#80BFBF" scope="col"><div align="left">Daftar Seluruh Course </div></th>
            </tr>
            <tr>
                <td>&nbsp;</td>
            </tr>
        </table></td>
</tr>
</table></td>
</tr>
</table></td>
</tr>
</table>
</body>
</html>
