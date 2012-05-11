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
                  <th width="900" bgcolor="#FFFFFF" scope="col"><div align="left"><a href="home_admin.jsp">Home</a> &gt;&gt; <a href="admin_manajemen_course.jsp">Manajemen Course </a></div></th>
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
                          <td><a href="edit-profil-admin">Ubah Profil</a> </td>
                                        </tr>
                                        <tr>
                                            <td><a href="manajemen-guru">Manajemen Guru</a></td>
                                        </tr>
                                        <tr>
                                            <td><a href="manajemen-siswa">Manajemen Siswa</a></td>
                                        </tr>
                                        <tr>
                                            <td><a href="manajemen-kelas">Manajemen Kelas</a> </td>
                                        </tr>
                                        <tr>
                                            <td><label>
                                                </label>
                                                <a href="manajemen-course">Manajemen Course</a> </td>
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
                    <td width="850"><table width="852" border="0" cellpadding="0" cellspacing="0">
                      <tr>
                        <th width="852" bgcolor="#80BFBF" scope="col"><div align="left">Daftar Course </div></th>
                      </tr>
                      <tr>
                        <td><form action="" method="post" enctype="multipart/form-data" name="form2">
                          <table width="852" border="1" cellpadding="0" cellspacing="0">
                            <tr>
                              <td colspan="9" scope="col">&nbsp;</td>
                            </tr>
                            <tr>
                              <td width="30" scope="col"><div align="center" class="style16"><strong>No</strong></div></td>
                              <td width="163" scope="col"><div align="center" class="style16"><strong>Nama</strong> Course </div></td>
                              <td width="139" scope="col"><div align="center" class="style16">Guru</div></td>
                              <td width="112" scope="col"><div align="center" class="style16">Kelas</div></td>
                              <td width="95" scope="col"><div align="center"><span class="style16">Tanggal Mulai </span></div></td>
                              <td width="120" scope="col"><div align="center"><span class="style16">Tanggal selesai </span></div></td>
                              <td width="99" scope="col"><div align="center"><span class="style16">Tanggal buat</span></div></td>
                              <td width="37" scope="col">&nbsp;</td>
                              <td width="37" scope="col">&nbsp;</td>
                            </tr>
                            <tr>
                              <td scope="col"><span class="style16"></span></td>
                              <td scope="col"><span class="style16"></span></td>
                              <td scope="col"><span class="style16"></span></td>
                              <td scope="col">&nbsp;</td>
                              <td scope="col"><div align="center" class="style16"></div></td>
                              <td scope="col"><div align="center" class="style16"><em><a href="admin_manajemen_kelas_edit.jsp"></a></em></div></td>
                              <td scope="col">&nbsp;</td>
                              <td scope="col"><div align="center" class="style23"><a href="admin_manajemen_course.jsp">Delete</a></div></td>
                              <td scope="col"><div align="center" class="style23"><a href="admin_manajemen_course_edit.jsp">Edit</a></div></td>
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
                      <th width="644" scope="col"><div align="right"><span class="style15"><a href="admin_manajemen_course_add.jsp">Add</a></span></div></th>
                    </tr>
                  </table>
                <p>&nbsp;</p></td>
              </tr>
            </table></td>
          </tr>
    </table>
    </body>
</html>
