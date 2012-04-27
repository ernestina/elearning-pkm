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
.style22 {
	font-size: 9px;
	font-weight: bold;
}
.style23 {font-size: 9px}
.style25 {font-size: 9}
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
            <td height="124"><img src="logo2.png" width="1056" height="186">
              <table width="1053" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <th width="803" bgcolor="#FFFFFF" scope="col"><div align="left"><a href="home_admin.jsp">Home</a> &gt;&gt; <a href="admin_manajemen_siswa.jsp">Manajemen Siswa </a></div></th>
                  <th width="71" bgcolor="#FFFFFF" scope="col"><div align="left" class="style15">Welcome,</div></th>
                  <th width="133" bgcolor="#FFFFFF" scope="col"><span class="style16"></span></th>
                  <th width="40" bgcolor="#FFFFFF" scope="col"><span class="style15"><a href="index.jsp">(logout)</a></span></th>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td height="124" align="center" valign="top"><table width="1049" border="0" align="center" cellspacing="0">
              <tr>
                <td width="176" height="441" align="center" valign="top"><table width="176" border="1" cellpadding="0" cellspacing="0">
                  <tr>
                    <td width="189"><form name="form1" method="post" action="login">
                      <table width="172" border="0" align="left">
                        <tr>
                          <td width="166" bgcolor="#80BFBF"><strong>MyMenu</strong></td>
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
                <p align="left">&nbsp;</p>
                <p>&nbsp;</p></td>
                <td width="8"><p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>                </td>
                <td width="859" align="center" valign="top"><table width="815" border="0">
                  <tr>
                    <td width="669"><table width="851" border="0" cellpadding="0" cellspacing="0">
                      <tr>
                        <th width="842" bgcolor="#80BFBF" scope="col"><div align="left">Daftar Siswa </div></th>
                      </tr>
                      <tr>
                        <td><form action="" method="post" enctype="multipart/form-data" name="form2">
                          <table width="856" border="1" cellpadding="0" cellspacing="0">
                            <tr>
                              <td width="27" scope="col"><div align="center" class="style22">No</div></td>
                              <td width="92" scope="col"><div align="center" class="style22">Nama</div></td>
                              <td width="72" scope="col"><div align="center" class="style22">NIS</div></td>
                              <td width="93" scope="col"><div align="center" class="style22">Email</div></td>
                              <td width="85" scope="col"><div align="center" class="style22">Username</div></td>
                              <td width="76" scope="col"><div align="center" class="style22">Password</div></td>
                              <td width="69" scope="col"><div align="center" class="style22">Telp</div></td>
                              <td width="73" scope="col"><div align="center" class="style22">Last Login </div></td>
                              <td width="70" scope="col"><div align="center" class="style22">Created date </div></td>
                              <td width="75" scope="col"><div align="center" class="style22">Confirmed</div></td>
                              <td width="62" scope="col"><div align="center" class="style23"><span class="style23"><span class="style25"></span></span>Deleted</div></td>
                              <td width="31" scope="col">&nbsp;</td>
                            </tr>
                            <tr>
                              <td scope="col"><span class="style23"></span></td>
                              <td scope="col"><span class="style23"></span></td>
                              <td scope="col"><span class="style23"></span></td>
                              <td scope="col"><span class="style23"></span></td>
                              <td scope="col"><span class="style23"></span></td>
                              <td scope="col"><span class="style23"></span></td>
                              <td scope="col"><span class="style23"></span></td>
                              <td scope="col"><span class="style23"></span></td>
                              <td scope="col"><span class="style23"></span></td>
                              <td scope="col">&nbsp;</td>
                              <td scope="col"><span class="style25"></span></td>
                              <td scope="col"><div align="center"><span class="style15"><a href="admin_manajemen_siswa_edit.jsp">edit</a></span></div></td>
                            </tr>
                          </table>
                                                </form>                        </td>
                      </tr>
                    </table></td>
                  </tr>
                  
                </table>
                  <table width="200" border="0">
                    <tr>
                      <th scope="col"><span class="style15">First</span></th>
                      <th scope="col"><span class="style15">Previous</span></th>
                      <th scope="col"><span class="style15">Next</span></th>
                      <th scope="col"><span class="style15">Last</span></th>
                    </tr>
                  </table>
                <p>&nbsp;</p></td>
              </tr>
            </table></td>
          </tr>
        </table>
    </body>
</html>
