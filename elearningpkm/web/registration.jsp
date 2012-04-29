<%-- 
    Document   : index
    Created on : Mar 13, 2012, 1:25:22 AM
    Author     : Accio
--%>

<%@page import="entity.School"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="model.UserRoleList"%>
<%@page import="entity.UserRole"%>
<%@page import="javax.swing.JOptionPane"%>

<% List<UserRole> userRole = (List<UserRole>) request.getAttribute("userRole");%>
<% UserRole roleUser;%>
<% Iterator<UserRole> iterator = userRole.iterator();%>

<% List<School> school = (List<School>) request.getAttribute("school");%>
<% School schoolIterator;%>
<% Iterator<School> iterator2 = school.iterator();%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Elearning:LMS Community</title>
        <style type="text/css">
            <!--
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
        <script type = "text/javascript">
            function disableDrop(){
                if(form2.role.options[0].selected){
                    form2.schoolbrowse.disabled = true;
                }
                else{
                    form2.schoolbrowse.disabled = false;
                }
            }
        </script>
    </head>
    <body>
        <table width="1052" border="0" align="center" cellspacing="0" bordercolor="#CCCCCC">
            <tr>
                <td width="1050" height="124" bgcolor="#FFFFFF"><img src="logo2.png" width="1050" height="175"></td>
            </tr>
            <tr>
                <td height="124" align="center" valign="top">              <table width="1046" border="0" align="left" cellpadding="0" cellspacing="0">


                        <tr>
                            <td colspan="9" bgcolor="#FFFFFF"><a href="index.jsp"><em>Back</em></a> &gt;&gt; </td>
                        </tr>

                        <tr>
                            <td colspan="9" bgcolor="#80BFBF">&nbsp;</td>
                        </tr>
                        <tr>
                            <td colspan="9" bgcolor="#80BFBF"><p><strong>Registration Form </strong></p>                </td>
                        </tr>
                        <tr>
                            <td colspan="9" bgcolor="#80BFBF"><form name="form2" method="post" action="prosesregister">
                                    <table width="1050" border="0" cellpadding="0" cellspacing="0">
                                        <tr>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td colspan="7" bgcolor="#80BFBF">&nbsp;</td>
                                        </tr>
                                        <tr>
                                            <td width="118" bgcolor="#80BFBF"> Identity Number </td>
                                            <td width="28" bgcolor="#80BFBF">:</td>
                                            <td colspan="7" bgcolor="#80BFBF"><label>
                                                    <input name="idnumber" type="text" size="18" maxlength="18">
                                                    (isikan dengan nomor induk siswa (nis) atau nomor induk pegawai(nip) </label></td>
                                        </tr>
                                        <tr>
                                            <td bgcolor="#80BFBF">First Name </td>
                                            <td bgcolor="#80BFBF">:</td>
                                            <td colspan="7" bgcolor="#80BFBF"><label>
                                                    <input name="fname" type="text" size="64" maxlength="64">
                                                </label></td>
                                        </tr>
                                        <tr>
                                            <td bgcolor="#80BFBF">Last Name </td>
                                            <td bgcolor="#80BFBF">:</td>
                                            <td colspan="7" bgcolor="#80BFBF"><label for="textfield"></label>
                                                <input name="lname" type="text" size="64" maxlength="64" ></td>
                                        </tr>
                                        <tr>
                                            <td bgcolor="#80BFBF">Username</td>
                                            <td bgcolor="#80BFBF">:</td>
                                            <td colspan="7" bgcolor="#80BFBF"><label for="label"></label>
                                                <input name="username" type="text" size="64" maxlength="64" ></td>
                                        </tr>
                                        <tr>
                                            <td bgcolor="#80BFBF">Password</td>
                                            <td bgcolor="#80BFBF">:</td>
                                            <td colspan="7" bgcolor="#80BFBF"><label for="label2"></label>
                                                <input name="password" type="text" size="20" maxlength="20" ></td>
                                        </tr>
                                        <tr>
                                            <td bgcolor="#80BFBF">Retype Password </td>
                                            <td bgcolor="#80BFBF">:</td>
                                            <td colspan="7" bgcolor="#80BFBF"><label for="label3"></label>
                                                <input name="password2" type="text" size="20" maxlength="20" ></td>
                                        </tr>
                                        <tr>
                                            <td bgcolor="#80BFBF">Role</td>
                                            <td bgcolor="#80BFBF">:</td>
                                            <td colspan="7" bgcolor="#80BFBF"><label for="select"></label>
                                                    <select name="role" size="1" id="select" onchange = "disableDrop();"><% while (iterator.hasNext()) {
                                  roleUser = iterator.next();%><option value="<%=roleUser.getRoleId()%>"><%=roleUser.getRoleName()%></option><%}%></select>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td colspan="2" bgcolor="#80BFBF">School Name </td>
                                            <td width="17" bgcolor="#80BFBF">:</td>
                                            <td colspan="4" bgcolor="#80BFBF"><label for="label4"></label>
                                                <input name="schoolname" type="text" id="label4" size="64" maxlength="64"></td>
                                        </tr>
                                        <tr>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td colspan="2" bgcolor="#80BFBF">School Email </td>
                                            <td bgcolor="#80BFBF">:</td>
                                            <td colspan="4" bgcolor="#80BFBF"><label for="textfield"></label>
                                                <input name="schoolemail" type="text" id="textfield" size="64" maxlength="64"></td>
                                        </tr>
                                        <tr>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td colspan="2" bgcolor="#80BFBF">School Name </td>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td colspan="4" bgcolor="#80BFBF"><label for="label5"></label>
                                                <label for="label"></label>
                                                <select name="schoolbrowse" id="label"><% while (iterator2.hasNext()) {
                                  schoolIterator = iterator2.next();%><option value="<%=schoolIterator.getSchoolId()%>"><%=schoolIterator.getSchoolName()%></option><%}%></select>
                                                </select>                      </td>
                                        </tr>
                                        <tr>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td bgcolor="#80BFBF"><input type="submit" name="Submit" value="Submit" id="Submit"></td>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                        </tr>
                                        <tr>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td width="26" bgcolor="#80BFBF">&nbsp;</td>
                                            <td width="72" bgcolor="#80BFBF">&nbsp;</td>
                                            <td bgcolor="#80BFBF">&nbsp;</td>
                                            <td width="217" bgcolor="#80BFBF">&nbsp;</td>
                                            <td width="101" bgcolor="#80BFBF">&nbsp;</td>
                                            <td width="97" bgcolor="#80BFBF">&nbsp;</td>
                                            <td width="374" bgcolor="#80BFBF">&nbsp;</td>
                                        </tr>
                                    </table>
                                </form>                </td>
                        </tr>


                    </table>            </td></tr>
        </table>
    </body>
</html>
