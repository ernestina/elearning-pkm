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
.style19 {font-size: 12}
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
</head>
    <body>
    <table width="1024" border="0" align="center" cellspacing="0" bordercolor="#CCCCCC">
          <tr>
            <td height="124"><img src="logo2.png" width="1056" height="187">
              <table width="1053" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <th width="815" bgcolor="#FFFFFF" scope="col"><div align="left"><a href="home_admin.jsp">Home</a> &gt;&gt; <a href="admin_manajemen_kelas.jsp">Manajemen Kelas </a>&gt;&gt; <a href="admin_manajemen_kelas_add.jsp">Add </a></div></th>
                  <th width="63" bgcolor="#FFFFFF" scope="col"><div align="left" class="style15">Welcome,</div></th>
                  <th width="133" bgcolor="#FFFFFF" scope="col"><span class="style16"></span></th>
                  <th width="42" bgcolor="#FFFFFF" scope="col"><span class="style15"><a href="index.jsp">(logout)</a></span></th>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td height="124" align="center" valign="top"><table width="1049" border="0" align="center" cellspacing="0">
              <tr>
                <td width="226" height="441" align="center" valign="top"><table width="224" border="1" cellpadding="0" cellspacing="0">
                  <tr>
                    <td><form name="form1" method="post" action="login">
                      <table width="222" border="0">
                        <tr>
                          <td width="206" bgcolor="#80BFBF"><strong>MyMenu</strong></td>
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
                          <td><a href="admin_manajemen_kelas.jsp">Manajemen Kelas </a></td>
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
                <td width="4"><p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>                </td>
                <td width="813" align="center" valign="top"><table width="815" border="0">
                  <tr>
                    <td width="669"><table width="814" border="0" cellpadding="0" cellspacing="0">
                      <tr>
                        <th width="814" bgcolor="#80BFBF" scope="col"><div align="left">Add Data Kelas  </div></th>
                      </tr>
                      <tr>
                        <td><form action="" method="post" enctype="multipart/form-data" name="form2">
                          <table width="814" border="0" cellpadding="0" cellspacing="0">
                            <tr>
                              <td scope="col">&nbsp;</td>
                              <td scope="col">&nbsp;</td>
                              <td scope="col">&nbsp;</td>
                            </tr>
                            <tr>
                              <td scope="col"><div align="left"><span class="style16">Nama Kelas </span></div></td>
                              <td scope="col"><div align="left"><span class="style16">:</span></div></td>
                              <td scope="col"><span class="style16">
                                <label for="textfield"></label>
                                <input name="textfield" type="text" id="textfield" size="18" maxlength="18">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Kategori Kelas </span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label"></label>
                                <label for="select"></label>
                                <select name="select" id="select">
                                </select>
                              </span></td>
                            </tr>
                            <tr>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td><label for="Submit"></label>
                                  <div align="right">
                                    <input type="submit" name="Submit" value="Submit" id="Submit">
                                </div></td>
                            </tr>
                          </table>
                                                </form>                        </td>
                      </tr>
                    </table></td>
                  </tr>
                  
                </table>
                  <p>&nbsp;</p></td>
              </tr>
            </table></td>
          </tr>
        </table>
    </body>
</html>
