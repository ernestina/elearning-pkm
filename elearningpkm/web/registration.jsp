<%-- 
    Document   : index
    Created on : Mar 13, 2012, 1:25:22 AM
    Author     : Accio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Elearning:LMS Community</title>
    </head>
    <body>
    <table width="1055" border="0" align="center" cellspacing="0" bordercolor="#CCCCCC">
          <tr>
            <td width="1053" height="124"><img src="header.jpg" width="1048" height="120" align="absmiddle"></td>
          </tr>
          <tr>
            <td height="124" align="center" valign="top"><form name="form1" method="post" action="">
              <table width="1053" border="0" align="left" cellpadding="0" cellspacing="0">
                <tr>
                  <td colspan="9" bgcolor="#0066FF"><a href="index.jsp">Back>></a></td>
                </tr>
                
                <tr>
                  <td colspan="9" bgcolor="#00CCFF"><p>Registration Form </p>
                  </td>
                </tr>
                <tr>
                  <td width="131" bgcolor="#00CCFF">Identity Number </td>
                  <td width="16" bgcolor="#00CCFF">:</td>
                  <td colspan="7" bgcolor="#00CCFF"><label>
                    <input name="idnumber" type="text" size="18" maxlength="18">
                  (isikan dengan nomor induk siswa (nis) atau nomor induk pegawai(nip) </label></td>
                </tr>
                <tr>
                  <td bgcolor="#00CCFF">First Name </td>
                  <td bgcolor="#00CCFF">:</td>
                  <td colspan="7" bgcolor="#00CCFF"><label>
                    <input name="fname" type="text" size="64" maxlength="64">
                  </label></td>
                </tr>
                <tr>
                  <td bgcolor="#00CCFF">Last Name </td>
                  <td bgcolor="#00CCFF">:</td>
                  <td colspan="7" bgcolor="#00CCFF"><label for="textfield"></label>
                  <input name="lname" type="text" size="64" maxlength="64" ></td>
                </tr>
                <tr>
                  <td bgcolor="#00CCFF">Username</td>
                  <td bgcolor="#00CCFF">:</td>
                  <td colspan="7" bgcolor="#00CCFF"><label for="label"></label>
                  <input name="username" type="text" size="64" maxlength="64" ></td>
                </tr>
                <tr>
                  <td bgcolor="#00CCFF">Password</td>
                  <td bgcolor="#00CCFF">:</td>
                  <td colspan="7" bgcolor="#00CCFF"><label for="label2"></label>
                  <input name="password" type="text" size="20" maxlength="20" ></td>
                </tr>
                <tr>
                  <td bgcolor="#00CCFF">Retype Password </td>
                  <td bgcolor="#00CCFF">:</td>
                  <td colspan="7" bgcolor="#00CCFF"><label for="label3"></label>
                  <input name="password" type="text" size="20" maxlength="20" ></td>
                </tr>
                <tr>
                  <td bgcolor="#00CCFF">Role</td>
                  <td bgcolor="#00CCFF">:</td>
                  <td colspan="7" bgcolor="#00CCFF"><label for="select"></label>
                    <select name="role" size="1" id="select">
                      <option value="2">Admin</option>
                      <option value="3" selected>Teacher</option>
                      <option value="4">Student</option>
                    </select>                  </td>
                </tr>
                <tr>
                  <td bgcolor="#00CCFF">&nbsp;</td>
                  <td bgcolor="#00CCFF">&nbsp;</td>
                  <td colspan="2" bgcolor="#00CCFF">School Name </td>
                  <td width="16" bgcolor="#00CCFF">:</td>
                  <td colspan="4" bgcolor="#00CCFF"><label for="label4"></label>
                  <input name="schoolnameinput" type="text" id="label4" size="64" maxlength="64"></td>
                </tr>
                <tr>
                  <td bgcolor="#00CCFF">&nbsp;</td>
                  <td bgcolor="#00CCFF">&nbsp;</td>
                  <td colspan="2" bgcolor="#00CCFF">School Email </td>
                  <td bgcolor="#00CCFF">:</td>
                  <td colspan="4" bgcolor="#00CCFF"><label for="textfield"></label>
                  <input name="schoolemail" type="text" id="textfield" size="64" maxlength="64"></td>
                </tr>
                <tr>
                  <td bgcolor="#00CCFF">&nbsp;</td>
                  <td bgcolor="#00CCFF">&nbsp;</td>
                  <td colspan="2" bgcolor="#00CCFF">School Name </td>
                  <td bgcolor="#00CCFF">&nbsp;</td>
                  <td colspan="4" bgcolor="#00CCFF"><label for="label5"></label>
                    <label for="label"></label>
                    <select name="schoolbrowse" id="label">
                    </select>                  </td>
                </tr>
                <tr>
                  <td bgcolor="#00CCFF">&nbsp;</td>
                  <td bgcolor="#00CCFF">&nbsp;</td>
                  <td colspan="7" bgcolor="#00CCFF">&nbsp;</td>
                </tr>
                <tr>
                  <td bgcolor="#00CCFF">&nbsp;</td>
                  <td bgcolor="#00CCFF">&nbsp;</td>
                  <td width="56" bgcolor="#00CCFF">&nbsp;</td>
                  <td width="56" bgcolor="#00CCFF">&nbsp;</td>
                  <td bgcolor="#00CCFF">&nbsp;</td>
                  <td width="175" bgcolor="#00CCFF">&nbsp;</td>
                  <td width="61" bgcolor="#00CCFF"><label>
                    <label for="Submit"></label>
                    <input type="submit" name="Submit" value="Submit" id="Submit">
                  </label></td>
                  <td width="57" bgcolor="#00CCFF"><label for="label2"></label></td>
                  <td width="485" bgcolor="#00CCFF"><label for="Submit"></label></td>
                </tr>
                <tr>
                  <td>&nbsp;</td>
                  <td>&nbsp;</td>
                  <td colspan="7">&nbsp;</td>
                </tr>
              </table>
                        </form>
            </td>
          </tr>
    </table>
    </body>
</html>
