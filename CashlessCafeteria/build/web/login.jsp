<%-- 
    Document   : login
    Created on : 21 Apr, 2020, 3:54:00 PM
    Author     : prince
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
String userid=request.getParameter("usr");
session.setAttribute("usr",userid);
String password=request.getParameter("password");
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
Statement st= con.createStatement();
ResultSet rs=st.executeQuery("select * from users where userid='"+userid+"' and password='"+password+"'");
try{
    if(rs.next()) {
        if(rs.getString("password").equals("9644")&&rs.getString("userid").equals("prince_p.3"))
        {
%>            
            <!DOCTYPE HTML>
<html>

<head>
	<title>Cashless cafeteria</title>
	<!-- Meta-Tags -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="utf-8">
	<meta name="keywords" content="Tool Sign In Form a Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible Web Template, Smartphone Compatible Web Template, Free Webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design">
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!-- //Meta-Tags -->
	<!-- Stylesheets -->
	<link href="css/stylee.css" rel='stylesheet' type='text/css' />
	<!--// Stylesheets -->
	<!--fonts-->
	<link href="//fonts.googleapis.com/css?family=Poiret+One&amp;subset=cyrillic,latin-ext" rel="stylesheet">
	<!--//fonts-->
</head>

<body>
    <br><br><br><br><br>
	<div class="w3ls-login box box--big">
		<!-- form starts here -->
		<form action="update.html" method="post">
			<div class="agile-field-txt">
			</div>
			<div class="agile-field-txt">
				<div class="agile_label">
				</div>
				<div class="agile-right">
					<h1> For Add Item</h1>
					
                                        <input type="submit" value="Add"><br><br><br><br>
				</div>
			</div>
			<!-- script for show password -->
			<script>
			</script>
			<!-- //end script -->
				
                                
		</form>
                <form action="indexhtml.jsp" method="post">
			<div class="agile-field-txt">
			</div>
			<div class="agile-field-txt">
				<div class="agile_label">
				</div>
				<div class="agile-right">
					<h1>For Delete Item</h1>
					
                                        <input type="submit" value="Delete"><br><br><br><br>
				</div>
			</div>
			<!-- script for show password -->
			<script>
			</script>
			<!-- //end script -->
				
                                
		</form>
	</div>
	<div class="copy-wthree">
	</div>
</body>
</html>
<%
        }
        else if(rs.getString("password").equals(password)&&rs.getString("userid").equals(userid))
        {
            //out.println("Welcome " +userid);
%>


<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link href="css/sstyle.css" rel="stylesheet" type="text/css"  media="all" />
		<title>Clip Website Template | Home :: W3layouts</title>
		<meta name="viewport" content="width=device-width,initial-scale=1">
		<link href='//fonts.googleapis.com/css?family=Carrois+Gothic+SC' rel='stylesheet' type='text/css'>
		<script src="js/jquery.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				//To switch directions up/down and left/right just place a "-" in front of the top/left attribute
				//Caption Sliding (Partially Hidden to Visible)
				$('.boxgrid.caption').hover(function(){
					$(".cover", this).stop().animate({top:'170px'},{queue:false,duration:160});
				}, function() {
					$(".cover", this).stop().animate({top:'220px'},{queue:false,duration:160});
				});
			});
		</script>
	</head>
	<body>
		<!-- Start-wrap -->
		
			<!-- Start-Header-->
			<div class="header">
				<div class="wrap">
				<!-- Start-logo-->
				<div class="logo">
					
				</div>
				<!-- End-Logo-->
				<!-- Start-Header-nav-->
				<div class="header-nav">
					<ul>
						<li class="active"><a href="index.html">Home</a></li>
						<li><a href="contact.html">Contact</a></li>
                                                <li class="active"><a href="index.html">Logout</a></li>
					</ul>
				</div>
				<div class="clear"> </div>
				<!-- End-Header-nav-->
			</div>
			<!-- End-Header-->
			<div class="clear"> </div>
			<!-- content-gallery-->
			</div>
			<div class="wrap">
			<div class="content-gallery">
				<div class="boxgrid caption">
				<img src="images/coffee.jpg"/>
				<div class="cover boxcaption">
					<h3>Coffee</h3>
					<p>Price : 20/-<br/><a href="#" target="_BLANK">Discount : 0%</a></p>
				</div>
			</div>
			</div>
			<div class="content-gallery">
				<div class="boxgrid caption">
				<img src="images/tea.jpg"/>
				<div class="cover boxcaption">
					<h3>Tea</h3>
					<p>Price : 10/-<br/><a href="#" target="_BLANK">Discount : 0%</a></p>
				</div>
			</div>
			</div>

				<div class="content-gallery">
				<div class="boxgrid caption">
				<img src="images/cocacola.jpg"/>
				<div class="cover boxcaption">
					<h3>Cocacola</h3>
					<p>Price : 20/-<br/><a href="#" target="_BLANK">Discount : 0%</a></p>
				</div>
			</div>
			</div>

				<div class="content-gallery">
				<div class="boxgrid caption">
				<img src="images/lays.jpg"/>
				<div class="cover boxcaption">
					<h3>Lays</h3>
					<p>Price : 20/-<br/><a href="#" target="_BLANK">Discount : 0%</a></p>
				</div>
				</div>
				</div>

				<div class="content-gallery">
				<div class="boxgrid caption">
				<img src="images/maaza.jpg"/>
				<div class="cover boxcaption">
					<h3>Maaza</h3>
					<p>Price : 20/-<br/><a href="#" target="_BLANK">Discount : 0%</a></p>
				</div>
			</div>
			</div>
			<div class="content-gallery">
				<div class="boxgrid caption">
				<img src="images/puff.jpg"/>
				<div class="cover boxcaption">
					<h3>Puff</h3>
					<p>Price : 10/-<br/><a href="#" target="_BLANK">Discount : 0%</a></p>
				</div>
			</div>
			</div>

			<div class="content-gallery">
				<div class="boxgrid caption">
				<img src="images/Fixlunch.jpg"/>
				<div class="cover boxcaption">
					<h3>Fix Lunch</h3>
					<p>Price : 100/-<br/><a href="#" target="_BLANK">Discount : 10%</a></p>
				</div>
			</div>
			</div>

			<div class="content-gallery">
				<div class="boxgrid caption">
				<img src="images/dhosa.jpg"/>
				<div class="cover boxcaption">
					<h3>Dhosa</h3>
					<p>Price : 80/-<br/><a href="#" target="_BLANK">Discount : 5%</a></p>
				</div>
			</div>
			</div>

			<div class="content-gallery">
				<div class="boxgrid caption">
				<img src="images/manchurian.jpg"/>
				<div class="cover boxcaption">
					<h3>Manchurian</h3>
					<p>Price : 80/-<br/><a href="#" target="_BLANK">Discount : 5%</a></p>
				</div>
				<div class="clear"> </div>
			</div>
			</div>
			</div>
			</div>
<div class="clear"> </div>
			<!-- End-content-gallery-->
			<!-- DC Pagination:C9 Start -->
			<div class="wrap">
<!-- DC Pagination:A3 Start -->
						<ul class="dc_pagination dc_paginationA dc_paginationA03">
						  <li><a href="#" class="first">First</a></li>
						  <li><a href="#" class="previous">Previous</a></li>
						  <li><a href="#">1</a></li>
						  <li><a href="#">2</a></li>
						  <li><a href="#" class="current">3</a></li>
						  <li><a href="#">4</a></li>
						  <li><a href="#">5</a></li>
						  <li><a href="#" class="next">Next</a></li>
						  <li><a href="#" class="last">Last</a></li>
						  
						</ul>
						<!-- DC Pagination:A3 End -->
    		
    		<div class="clear"> </div>

<!-- DC Pagination:C9 End -->

		</div>
	<div class="clear"> </div>
			<div class="footer1">
			</div>
		<!-- End-wrap -->
		
	</body>
</html>





<%
        }
        else{
            out.println("Invalid password or username.");
        }
    }
    else{
        out.println("Null");
    }
}
catch (SQLException e) {
    out.println("Exception\n");
    out.println(e);
    e.printStackTrace();
}
%> 