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
.style23 {
	font-size: 9px;
	font-style: italic;
}
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
    <table width="1060" border="0" align="center" cellspacing="0" bordercolor="#CCCCCC">
          <tr>
            <td width="1058" height="124"><img src="logo2.png" width="1059" height="176">
              <table width="1053" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <th width="900" bgcolor="#FFFFFF" scope="col"><div align="left"><a href="home_siswa.jsp">Home</a> &gt;&gt; <a href="siswa_mycourse.jsp">MyCourse </a></div></th>
                  <th width="100" bgcolor="#FFFFFF" scope="col"><div align="left" class="style15"><% if (logedUser != null) {%><%="Welcome, " + logedUser%><%}%></div></th>
                  <th width="9" bgcolor="#FFFFFF" scope="col"><span class="style16"></span></th>
                  <th width="44" bgcolor="#FFFFFF" scope="col"><span class="style15"><a href="index.jsp">(logout)</a></span></th>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td height="124" align="center" valign="top"><table width="1058" border="0" align="center" cellspacing="0">
              <tr>
                <td width="188" height="441" align="center" valign="top"><table width="188" border="1" cellpadding="0" cellspacing="0">
                  <tr>
                    <td width="184"><form name="form1" method="post" action="login">
                      <table width="184" border="0" align="left">
                        <tr>
                          <td width="167" bgcolor="#80BFBF"><strong>MyMenu</strong></td>
                        </tr>
                        <tr>
                          <td><a href="siswa_ubah_profil.jsp">Ubah Profil </a></td>
                        </tr>
                        <tr>
                          <td><a href="siswa_mycourse.jsp">My Course</a><a href="admin_manajemen_guru.jsp"></a></td>
                        </tr>
                      </table>
                                        </form>                    </td>
                  </tr>
                </table>
                <p>&nbsp;</p>
                <p>&nbsp;</p></td>
                <td width="4"><p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>                </td>
                <td width="860" align="center" valign="top"><table width="856" border="0">
                  <tr>
                    <td width="850"><table width="861" border="0" cellpadding="0" cellspacing="0">
                      <tr>
                        <th width="982" bgcolor="#80BFBF" scope="col"><div align="left">Daftar Course </div></th>
                      </tr>
                      <tr>
                        <td><form action="" method="post" enctype="multipart/form-data" name="form2">
                          <table width="861" border="1" cellpadding="0" cellspacing="0">
                            <tr>
                              <td colspan="5" scope="col"><div align="center"></div></td>
                            </tr>
                            <tr>
                              <td width="53" scope="col"><div align="center">No</div></td>
                              <td width="306" scope="col"><div align="center">Nama Course </div></td>
                              <td width="135" scope="col"><div align="center">Guru</div></td>
                              <td width="76" scope="col"><div align="center">Kelas</div></td>
                              <td width="279" scope="col"><div align="center"></div></td>
                            </tr>
                            <tr>
                              <td scope="col"><span class="style16"></span></td>
                              <td scope="col"><span class="style16"></span></td>
                              <td scope="col"><span class="style16"></span></td>
                              <td scope="col">&nbsp;</td>
                              <td scope="col"><div align="center" class="style23"><a href="admin_manajemen_course_edit.jsp">detil</a></div></td>
                            </tr>
                          </table>
                                                </form>                        </td>
                      </tr>
                    </table></td>
                  </tr>
                  
                </table>
                  <table width="855" border="0" align="left">
                    <tr>
                      <th width="39" scope="col"><span class="style15">First</span></th>
                      <th width="69" scope="col"><span class="style15">Previous</span></th>
                      <th width="39" scope="col"><span class="style15">Next</span></th>
                      <th width="42" scope="col"><span class="style15">Last</span></th>
                      <th width="644" scope="col"><div align="right"><span class="style15"><a href="admin_manajemen_course_add.jsp"></a></span></div></th>
                    </tr>
                  </table>
                <p>&nbsp;</p></td>
              </tr>
            </table></td>
          </tr>
    </table>
    </body>
</html>
