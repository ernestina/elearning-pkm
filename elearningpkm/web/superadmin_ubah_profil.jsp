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
.style17 {font-size: 12}
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
            <td height="124"><img src="logo2.png" width="1058" height="181">
              <table width="1053" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <th width="803" bgcolor="#FFFFFF" scope="col"><div align="left"><a href="home_siswa.jsp">Home</a> &gt;&gt; <a href="siswa_ubah_profil.jsp">Ubah Profil</a> </div></th>
                 <th width="80" bgcolor="#FFFFFF" scope="col"><div align="left" class="style15"><% if (logedUser != null) {%><%="Welcome, " + logedUser%><%}%></div></th>
                        <th width="10" bgcolor="#FFFFFF" scope="col"><span class="style16"></span></th>
                  <th width="40" bgcolor="#FFFFFF" scope="col"><span class="style15"><a href="index.jsp">(logout)</a></span></th>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td height="124" align="center" valign="top"><table width="1044" border="0" align="center" cellspacing="0">
              <tr>
                <td width="226" height="441" align="center" valign="top"><table width="224" border="1" cellpadding="0" cellspacing="0">
                  <tr>
                    <td><form name="form1" method="post" action="login">
                      <table width="222" border="0">
                        <tr>
                          <td width="206" bgcolor="#80BFBF"><strong>MyMenu</strong></td>
                        </tr>
                        <tr>
                          <td><a href="superadmin_ubah_profil.jsp">Ubah Profil</a> </td>
                        </tr>
                        <tr>
                          <td><a href="superadmin_ubah_profil.jsp">Manajemen User</a> </td>
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
                <td width="808" align="center" valign="top"><table width="800" border="0">
                  <tr>
                    <td width="794"><table width="617" border="1" cellpadding="0" cellspacing="0">
                      <tr>
                        <th width="613" bgcolor="#80BFBF" scope="col"><div align="left">Data Pribadi </div></th>
                      </tr>
                      <tr>
                        <td><form action="" method="post" enctype="multipart/form-data" name="form2">
                          <table width="811" border="0">
                            <tr>
                              <td width="135" scope="col"><span class="style16">Nama</span></td>
                              <td width="9" scope="col"><div align="left"><span class="style16">:</span></div></td>
                              <td width="653" scope="col"><span class="style16">
                                <label for="textfield"></label>
                                <input name="textfield" type="text" id="textfield" size="18" maxlength="18">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Tanggal Buat </span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label"></label>
                                <input name="textfield2" type="text" id="label" size="64" maxlength="64">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Email</span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label2"></label>
                                <input name="textfield3" type="text" id="label2" size="64" maxlength="64">
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
                  <tr>
                    <td><table width="550" border="1" cellpadding="0" cellspacing="0">
                      <tr>
                        <th bgcolor="#80BFBF" scope="col"><div align="left">Username dan Password </div></th>
                      </tr>
                      <tr>
                        <td><form name="form3" method="post" action="">
                          <table width="809" border="0">
                            <tr>
                              <td width="137" scope="col"><div align="left" class="style16">Username</div></td>
                              <td width="9" scope="col"><div align="left"><span class="style16"></span></div></td>
                              <td width="649" scope="col"><div align="left" class="style16">
                                <label for="label12"></label>
                                <input name="textfield13" type="text" id="label12" size="64" maxlength="64">
                              </div></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Password lama </span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label15"></label>
                                <input name="textfield16" type="text" id="label15" size="20" maxlength="20">
                              </span></td>
                            </tr>
                            <tr>
                              <td><div align="left" class="style16">Password baru </div></td>
                              <td><div align="left"><span class="style16"></span></div></td>
                              <td><div align="left"><span class="style16"></span>
                                <label for="label13"></label>
                                <input name="textfield14" type="password" id="label13" size="20" maxlength="20">
                              </div></td>
                            </tr>
                            <tr>
                              <td><div align="left" class="style16">Ketik kembali Password </div></td>
                              <td><div align="left"><span class="style16"></span></div></td>
                              <td><div align="left"><span class="style16"></span>
                                      <label for="label14"></label>
                                      <input name="textfield15" type="password" id="label14" size="20" maxlength="20">
                              </div></td>
                            </tr>
                            <tr>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td><label for="label16"></label>
                                <div align="right">
                                  <input type="submit" name="Submit2" value="Submit" id="label16">
                              </div></td>
                            </tr>
                          </table>
                                                </form>                        </td>
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
