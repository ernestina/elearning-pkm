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
</head>
    <body>
    <table width="1024" border="0" align="center" cellspacing="0" bordercolor="#CCCCCC">
          <tr>
            <td height="124"><img src="header.jpg" width="1053" height="120" align="absmiddle">
              <table width="1053" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <th width="803" bgcolor="#FFFFFF" scope="col"><div align="left"><a href="home_admin.jsp">Home</a> &gt;&gt; <a href="admin_ubah_profil.jsp">Ubah Profil </a></div></th>
                  <th width="71" bgcolor="#FFFFFF" scope="col"><div align="left" class="style15">Welcome,</div></th>
                  <th width="133" bgcolor="#FFFFFF" scope="col"><span class="style16"></span></th>
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
                          <td width="206" bgcolor="#0066FF"><strong>MyMenu</strong></td>
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
                        <th width="613" bgcolor="#0066FF" scope="col"><div align="left">Data Pribadi </div></th>
                      </tr>
                      <tr>
                        <td><form action="" method="post" enctype="multipart/form-data" name="form2">
                          <table width="811" border="0">
                            <tr>
                              <td width="135" scope="col"><div align="left"><span class="style16">Nomor identitas pegawai </span></div></td>
                              <td width="9" scope="col"><div align="left"><span class="style16">:</span></div></td>
                              <td width="653" scope="col"><span class="style16">
                                <label for="textfield"></label>
                                <input name="textfield" type="text" id="textfield" size="18" maxlength="18">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Nama depan </span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label"></label>
                                <input name="textfield2" type="text" id="label" size="64" maxlength="64">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Nama belakang </span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label2"></label>
                                <input name="textfield3" type="text" id="label2" size="64" maxlength="64">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Email</span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label3"></label>
                                <input name="textfield4" type="text" id="label3" size="64" maxlength="64">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Alamat</span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label11"></label>
                                <input name="textfield12" type="text" id="label11" size="64" maxlength="64">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Kota</span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label4"></label>
                                <input name="textfield5" type="text" id="label4" size="64" maxlength="64">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Provinsi</span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label5"></label>
                                <input name="textfield6" type="text" id="label5" size="64" maxlength="64">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Kode Pos </span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label6"></label>
                                <input name="textfield7" type="text" id="label6" size="10" maxlength="10">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Tanggal lahir </span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label7"></label>
                                <input name="textfield8" type="text" id="label7" size="8" maxlength="8">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Agama</span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label8"></label>
                                <input name="textfield9" type="text" id="label8" size="32" maxlength="32">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Nomor Kontak </span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label9"></label>
                                <input name="textfield10" type="text" id="label9" size="20">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Sekolah</span></td>
                              <td><span class="style17">:</span></td>
                              <td><label for="select"></label>
                                <select name="select" id="select">
                                </select>                              </td>
                            </tr>
                            <tr>
                              <td><span class="style16">Status Konfirmasi </span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label10"></label>
                                <input name="textfield11" type="text" id="label10" size="3" maxlength="3">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">File Foto </span></td>
                              <td>:</td>
                              <td><label for="file"></label>
                              <input type="file" name="file" id="file"></td>
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
                        <th bgcolor="#0066FF" scope="col"><div align="left">Username dan Password </div></th>
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
