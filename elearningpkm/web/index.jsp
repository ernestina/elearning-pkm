<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xml:lang="en" xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
<meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
<title>Elearning:LMS Community</title>
<link href="front.css" media="screen, projection" rel="stylesheet" type="text/css">
</head>
<body>
<table>
<tr>
	<th>
<br />
	</th>
</tr>
</table>
<div align="center"></div>
<div id="container">
  <div id="topnav" class="topnav"> Sudah memiliki akun? <a href="login" class="signin"><span>Sign in</span></a> </div>
  <fieldset id="signin_menu">
    <form method="post" id="signin" action="login">
      <label for="username">Username</label>
      <input id="username" name="username" value="" title="username" tabindex="4" type="text">
      </p>
      <p>
        <label for="password">Password</label>
        <input id="password" name="password" value="" title="password" tabindex="5" type="password">
      </p>
      <p class="remember">
        <input id="signin_submit" value="Sign in" tabindex="6" type="submit">
        <input id="remember" name="remember_me" value="1" tabindex="7" type="checkbox">
        <label for="remember">Ingat saya</label>
      </p>
<p><a href="registration.jsp">Click here to register..</a> </p>
    </form>
  </fieldset>
</div>
<script src="javascripts/jquery.js" type="text/javascript"></script>
<script type="text/javascript">
        $(document).ready(function() {

            $(".signin").click(function(e) {          
				e.preventDefault();
                $("fieldset#signin_menu").toggle();
				$(".signin").toggleClass("menu-open");
            });
			
			$("fieldset#signin_menu").mouseup(function() {
				return false
			});
			$(document).mouseup(function(e) {
				if($(e.target).parent("a.signin").length==0) {
					$(".signin").removeClass("menu-open");
					$("fieldset#signin_menu").hide();
				}
			});			
			
        });
</script>
<script src="javascripts/jquery.tipsy.js" type="text/javascript"></script>
<script type='text/javascript'>
    $(function() {
	  $('#forgot_username_link').tipsy({gravity: 'w'});   
    });
  </script>
<table width="1024" height="484" border="0" align="center">
  <tr>
    <th height="425" bgcolor="#80BFBF" scope="col"><p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p></th>
  </tr>
  <tr>
    <th scope="col"><p>&nbsp;</p>
      <p>Tim Pengembang :<br />
        Novan Andre Valen <br>
        Ernestina Rahhmanasari <br />
        Slamet Darmawan <br />
      </p></th>
  </tr>
</table>
<p>&nbsp;</p>
</body>
</html>