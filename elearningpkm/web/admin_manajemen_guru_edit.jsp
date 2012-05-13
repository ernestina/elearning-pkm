<%-- 
    Document   : index
    Created on : Mar 13, 2012, 1:25:22 AM
    Author     : Accio
--%>

<%@page import="entity.User"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% User listUser = (User) request.getAttribute("edit-guru");%>
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
        <%String logedUser = (String) session.getAttribute("username");%>
    </head>
    <body>
        <table width="1024" border="0" align="center" cellspacing="0" bordercolor="#CCCCCC">
            <tr>
                <td height="124"><img src="logo2.png" width="1059" height="174">
                    <table width="1053" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <th width="815" bgcolor="#FFFFFF" scope="col"><div align="left"><a href="home_admin.jsp">Home</a> &gt;&gt; <a href="admin_manajemen_guru.jsp">Manajemen Guru </a>&gt;&gt; <a href="admin_manajemen_guru_edit.jsp">Edit </a></div></th>
                        <th width="80" bgcolor="#FFFFFF" scope="col"><div align="left" class="style15"><% if (logedUser != null) {%><%="Welcome, " + logedUser%><%}%></div></th>
                        <th width="10" bgcolor="#FFFFFF" scope="col"><span class="style16"></span></th>
                        <th width="42" bgcolor="#FFFFFF" scope="col"><span class="style15"><a href="index.jsp">(logout)</a></span></th>
            </tr>
        </table></td>
</tr>
<tr>
    <td height="124" align="center" valign="top"><table width="1049" border="0" align="center" cellspacing="0">
            <tr>
                <td width="226" height="441" align="center" valign="top"><table width="224" border="1" cellpadding="0" cellspacing="0">
                        <tr><%=listUser.getFName()%>
                            <td><form name="form1" method="post" action="login">
                                    <table width="222" border="0">
                                        <tr>
                                            <td width="206" bgcolor="#80BFBF"><strong>MyMenu</strong></td>
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
                <td width="813" align="center" valign="top"><table width="815" border="0">
                        <tr>
                            <td width="669"><table width="814" border="0" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <th width="814" bgcolor="#80BFBF" scope="col"><div align="left">Edit Data  Guru </div></th>
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
                                            <td scope="col"><div align="left"><span class="style16">Nomor identitas pegawai </span></div></td>
                                            <td scope="col"><div align="left"><span class="style16">:</span></div></td>
                                            <td scope="col"><span class="style16">
                                                    <label for="textfield"></label>
                                                    <input name="nipnis" type="text" id="textfield" size="18" maxlength="18" value="">
                                                </span></td>
                                        </tr>
                                        <tr>
                                            <td><span class="style16">Nama</span></td>
                                            <td><span class="style16">:</span></td>
                                            <td><span class="style16">
                                                    <label for="label"></label>
                                                    <input name="fname" type="text" id="label" size="64" maxlength="128">
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
                                            <td class="style16"><span class="style19">Username</span></td>
                                            <td class="style16"><span class="style19">:</span></td>
                                            <td class="style16"><span class="style19">
                                                    <label for="label4"></label>
                                                    <input name="textfield3" type="text" id="label4" size="64" maxlength="64">
                                                </span></td>
                                        </tr>
                                        <tr>
                                            <td class="style16"><span class="style19">Password</span></td>
                                            <td class="style16"><span class="style19">:</span></td>
                                            <td class="style16"><span class="style19">
                                                    <label for="label5"></label>
                                                    <input name="textfield5" type="text" id="label5" size="20" maxlength="20">
                                                </span></td>
                                        </tr>
                                        <tr>
                                            <td><span class="style16">Nomor Kontak </span></td>
                                            <td><span class="style16">:</span></td>
                                            <td><span class="style16">
                                                    <label for="label9"></label>
                                                    <input name="textfield10" type="text" id="label9" size="20" maxlength="20">
                                                </span></td>
                                        </tr>
                                        <tr>
                                            <td><span class="style16">Status Konfirmasi </span></td>
                                            <td><span class="style16">:</span></td>
                                            <td><span class="style16">
                                                    <label for="label10"></label>
                                                    <label for="label2"></label>
                                                    <select name="select2" id="label2">
                                                    </select>
                                                </span></td>
                                        </tr>
                                        <tr>
                                            <td bordercolor="#FFFFFF"><span class="style16">Status Hapus </span></td>
                                            <td bordercolor="#FFFFFF"><span class="style16"></span></td>
                                            <td bordercolor="#FFFFFF"><span class="style16">
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
