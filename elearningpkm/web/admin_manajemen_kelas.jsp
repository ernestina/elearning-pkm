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
            <td height="124"><img src="logo2.png" width="1060" height="178">
              <table width="1053" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <th width="803" bgcolor="#FFFFFF" scope="col"><div align="left"><a href="home_admin.jsp">Home</a> &gt;&gt; <a href="admin_manajemen_kelas.jsp">Manajemen Kelas </a></div></th>
                  <th width="80" bgcolor="#FFFFFF" scope="col"><div align="left" class="style15"><% if (logedUser != null) {%><%="Welcome, " + logedUser%><%}%></div></th>
                        <th width="10" bgcolor="#FFFFFF" scope="col"><span class="style16"></span></th>
                  <th width="40" bgcolor="#FFFFFF" scope="col"><span class="style15"><a href="index.jsp">(logout)</a></span></th>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td height="124" align="center" valign="top"><table width="1049" border="0" align="center" cellspacing="0">
              <tr>
                <td width="188" height="441" align="center" valign="top"><table width="188" border="1" cellpadding="0" cellspacing="0">
                  <tr>
                    <td width="184"><form name="form1" method="post" action="login">
                      <table width="184" border="0" align="left">
                        <tr>
                          <td width="167" bgcolor="#80BFBF"><strong>MyMenu</strong></td>
                        </tr>
                        <tr>
                          <td><a href="admin_ubah_profil.jsp">Ubah Profil </a></td>
                        </tr>
                        <tr>
                          <td><a href="admin_manajemen_guru.jsp">Manajemen Guru</a></td>
                        </tr>
                        <tr>
                          <td><a href="admin_manajemen_siswa.jsp">Manajemen Siswa</a></td>
                        </tr>
                        <tr>
                          <td><a href="admin_manajemen_kelas.jsp">Manajemen Kelas</a> </td>
                        </tr>
                        <tr>
                          <td><label>
                          </label>
                          <a href="admin_manajemen_course.jsp">Manajemen Course</a> </td>
                        </tr>
                      </table>
                                        </form>                    </td>
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
                <td width="847" align="center" valign="top"><table width="841" border="0">
                  <tr>
                    <td width="828"><table width="853" border="0" cellpadding="0" cellspacing="0">
                      <tr>
                        <th width="839" bgcolor="#80BFBF" scope="col"><div align="left">Daftar Kelas </div></th>
                      </tr>
                      <tr>
                        <td><form action="" method="post" enctype="multipart/form-data" name="form2">
                          <table width="592" border="1" cellpadding="0" cellspacing="0">
                            <tr>
                              <td width="36" scope="col"><div align="center" class="style16"><strong>No</strong></div></td>
                              <td width="228" scope="col"><div align="center" class="style16"><strong>Nama</strong> Kelas </div></td>
                              <td width="237" scope="col"><div align="center" class="style16">Kategori Kelas </div></td>
                              <td width="48" scope="col">&nbsp;</td>
                              <td width="31" scope="col">&nbsp;</td>
                            </tr>
                            <tr>
                              <td scope="col"><span class="style16"></span></td>
                              <td scope="col"><span class="style16"></span></td>
                              <td scope="col"><span class="style16"></span></td>
                              <td scope="col"><div align="center" class="style16"><a href="admin_manajemen_kelas.jsp">delete</a></div></td>
                              <td scope="col"><div align="center"><span class="style15"><a href="admin_manajemen_kelas_edit.jsp">edit</a></span></div></td>
                            </tr>
                          </table>
                                                </form>                        </td>
                      </tr>
                    </table></td>
                  </tr>
                  
                </table>
                  <table width="596" border="0" align="left">
                    <tr>
                      <th width="39" scope="col"><span class="style15">First</span></th>
                      <th width="69" scope="col"><span class="style15">Previous</span></th>
                      <th width="39" scope="col"><span class="style15">Next</span></th>
                      <th width="42" scope="col"><span class="style15">Last</span></th>
                      <th width="385" scope="col"><div align="right"><span class="style16"><em><a href="admin_manajemen_kelas_add.jsp">Add</a></em></span></div></th>
                    </tr>
                  </table>
                <p>&nbsp;</p></td>
              </tr>
            </table></td>
          </tr>
        </table>
    </body>
</html>
