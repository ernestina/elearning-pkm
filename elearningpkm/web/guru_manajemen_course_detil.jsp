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
.style17 {font-size: 10px}
.style18 {font-size: 12; }
.style19 {font-size: 10px; font-style: italic; }
-->
        </style>
		<%String logedUser = (String) session.getAttribute("username");%>
</head>
    <body>
    <table width="1063" border="0" align="center" cellspacing="0" bordercolor="#CCCCCC">
          <tr>
            <td width="1061" height="124"><img src="logo2.png" width="1060" height="167">
              <table width="1053" border="0" cellpadding="0" cellspacing="0">
                <tr>
                  <th width="815" bgcolor="#FFFFFF" scope="col"><div align="left"><a href="home_admin.jsp">Home</a> &gt;&gt; <a href="admin_manajemen_course.jsp">Manajemen Course </a>&gt;&gt; <a href="admin_manajemen_course_add.jsp">Detil </a></div></th>
                  <th width="80" valign="middle" bgcolor="#FFFFFF" scope="col"><div align="left" class="style15"><% if (logedUser != null) {%><%="Welcome, " + logedUser%><%}%></div></th>
                        <th width="10" bgcolor="#FFFFFF" scope="col"><span class="style16"></span></th>
                  <th width="42" valign="middle" bgcolor="#FFFFFF" scope="col"><span class="style15"><a href="index.jsp">(logout)</a></span></th>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td height="124" align="left" valign="top"><table width="1059" border="0" align="center" cellspacing="0">
              <tr>
                <td width="165" height="441" align="left" valign="top"><table width="163" border="1" cellpadding="0" cellspacing="0">
                  <tr>
                    <td width="222"><form name="form1" method="post" action="login">
                      <table width="161" border="0">
                        <tr>
                          <td width="155" bgcolor="#80BFBF"><strong>MyMenu</strong></td>
                        </tr>
                        <tr>
                          <td><a href="admin_ubah_profil.jsp">Ubah Profil </a></td>
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
                <td width="4"><p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>                </td>
                <td width="1235" align="left" valign="top"><table width="883" border="0">
                  <tr>
                    <td width="877"><table width="814" border="0" cellpadding="0" cellspacing="0">
                      <tr>
                        <th width="814" bgcolor="#80BFBF" scope="col"><div align="left">Course  </div></th>
                      </tr>
                      <tr>
                        <td><form action="" method="post" enctype="multipart/form-data" name="form2">
                          <table width="878" border="0" cellpadding="0" cellspacing="0">
                            <tr>
                              <td scope="col">&nbsp;</td>
                              <td scope="col">&nbsp;</td>
                              <td scope="col">&nbsp;</td>
                            </tr>
                            <tr>
                              <td width="143" scope="col"><div align="left" class="style16"><span class="style16">Nama Course </span></div></td>
                              <td width="10" scope="col"><div align="left"><span class="style16">:</span></div></td>
                              <td width="725" scope="col"><span class="style16">
                                <label for="textfield"></label>
                                <input name="textfield" type="text" id="textfield" size="18" maxlength="18">
                              </span></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Guru</span></td>
                              <td>&nbsp;</td>
                              <td><label for="select"></label>
                                <label for="label"></label>
                                <input type="text" name="textfield2" id="label">
                                <label for="label"></label></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Kelas</span></td>
                              <td>&nbsp;</td>
                              <td><label for="label5"></label>
                                <input type="text" name="textfield6" id="label5">                                <label for="label"></label></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Tanggal mulai </span></td>
                              <td>&nbsp;</td>
                              <td><label for="label2"></label>
                              <input type="text" name="textfield3" id="label2"></td>
                            </tr>
                            <tr>
                              <td><span class="style16">Tanggal selesai </span></td>
                              <td>&nbsp;</td>
                              <td><label for="label3"></label>
                              <input type="text" name="textfield4" id="label3"></td>
                            </tr>
                            <tr>
                              <td><span class="style16 style16">Tanggal buat </span></td>
                              <td><span class="style16">:</span></td>
                              <td><span class="style16">
                                <label for="label"></label>
                                <label for="select"></label>
                                <label for="label4"></label>
                                <input type="text" name="textfield5" id="label4">
                              </span></td>
                            </tr>
                            <tr>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td><label for="Submit"></label>
                                <div align="right"></div></td>
                            </tr>
                          </table>
                                                </form>                        </td>
                      </tr>
                    </table></td>
                  </tr>
                  
                </table>
                  <br>
                  <table width="880" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                      <th width="473" bgcolor="#80BFBF" scope="col"><div align="left">Information</div></th>
                      <th width="410" bgcolor="#80BFBF" scope="col"><div align="right"><em>Add</em></div></th>
                    </tr>
                    <tr>
                      <td colspan="2"><form action="" method="post" enctype="multipart/form-data" name="form2">
                          <table width="883" border="0" cellpadding="0" cellspacing="0">
                            <tr>
                              <td width="105" bgcolor="#CCCCCC" scope="col"><div align="center" class="style18">Title</div></td>
                              <td width="94" bgcolor="#CCCCCC" scope="col"><div align="center" class="style18">Date Modified </div></td>
                              <td width="585" bgcolor="#CCCCCC" scope="col"><div align="center" class="style18">Body</div></td>
                              <td width="53" bgcolor="#CCCCCC" scope="col"><span class="style18"></span></td>
                              <td width="46" bgcolor="#CCCCCC" scope="col"><div align="center"><span class="style17"><span class="style16"><span class="style18"></span></span></span></div></td>
                            </tr>

                            <tr>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                            </tr>
                            <tr>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                            </tr>
                            <tr>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                            </tr>
                            <tr>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                            </tr>
                            <tr>
                              <td><span class="style16"></span></td>
                              <td><span class="style16"></span></td>
                              <td><span class="style16"></span></td>
                              <td><div align="center" class="style19">delete</div></td>
                              <td><span class="style19">
                                <label for="Submit"></label>                                  
                              </span>
                                <div align="center" class="style19">edit                              </div></td>
                            </tr>
                        </table>
                      </form></td>
                    </tr>
                  </table>
                  <br>
                  <table width="800" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                      <th width="471" bgcolor="#80BFBF" scope="col"><div align="left">Assignment</div></th>
                      <th width="329" bgcolor="#80BFBF" scope="col"><div align="right"><em>Add</em></div></th>
                    </tr>
                    <tr>
                      <td colspan="2"><form action="" method="post" enctype="multipart/form-data" name="form2">
                          <table width="884" border="0" cellpadding="0" cellspacing="0">
                            <tr>
                              <td width="79" scope="col"><div align="center" class="style18">Title</div></td>
                              <td width="386" scope="col"><div align="center" class="style18">Notes </div></td>
                              <td width="98" scope="col"><div align="center" class="style18">Start date </div></td>
                              <td width="102" scope="col"><div align="center"><span class="style18">Finish Date </span></div></td>
                              <td width="124" scope="col"><div align="center">File</div></td>
                              <td width="51" scope="col">&nbsp;</td>
                              <td width="44" scope="col"><div align="center"><span class="style17"><span class="style16"><span class="style18"></span></span></span></div></td>
                            </tr>
                            <tr>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                            </tr>
                            <tr>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                            </tr>
                            <tr>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                            </tr>
                            <tr>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                              <td>&nbsp;</td>
                            </tr>
                            <tr>
                              <td><span class="style16"></span></td>
                              <td><span class="style16"></span></td>
                              <td><span class="style16"></span></td>
                              <td><div align="center" class="style19"></div></td>
                              <td>&nbsp;</td>
                              <td><div align="center" class="style19">delete</div></td>
                              <td><span class="style19">
                                <label for="Submit"></label>
                                </span>
                                  <div align="center" class="style19">edit </div></td>
                            </tr>
                          </table>
                      </form></td>
                    </tr>
                  </table>				  
                <br>
                <table width="884" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <th width="471" bgcolor="#80BFBF" scope="col"><div align="left">Time Learning </div></th>
                    <th width="329" bgcolor="#80BFBF" scope="col"><div align="right"><em>Add</em></div></th>
                  </tr>
                  <tr>
                    <td colspan="2"><form action="" method="post" enctype="multipart/form-data" name="form2">
                        <table width="883" border="0" cellpadding="0" cellspacing="0">
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
                          <tr>
                            <td>&nbsp;</td>
                          </tr>
                          <tr>
                            <td>&nbsp;</td>
                          </tr>
                          <tr>
                            <td><span class="style16"></span><span class="style16"></span>                              <div align="center" class="style19"></div>                              <span class="style19">
                              <label for="Submit"></label>
                            </span></td>
                          </tr>
                        </table>
                    </form></td>
                  </tr>
                </table>				</td>
              </tr>
            </table>
            <div align="left"></div></td>
          </tr>
    </table>
    </body>
</html>
