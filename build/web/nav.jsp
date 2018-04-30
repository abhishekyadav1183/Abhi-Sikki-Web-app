<%-- 
    Document   : nav
    Created on : 9 Aug, 2017, 3:44:40 PM
    Author     : Sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans|Open+Sans+Condensed:300|Oswald" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">  
    <link href="css/owl.carousel.css" rel="stylesheet" type="text/css"/>
    <link href="css/owl.theme.css" rel="stylesheet" type="text/css"/>
    <link href="css/owl.transitions.css" rel="stylesheet" type="text/css"/>
    <script src="js/owl.carousel.min.js" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-router/1.0.3/angular-ui-router.min.js"></script>
    <script src="custom/ang.js" type="text/javascript"></script>
    <script src="custom/jsjs.js" type="text/javascript"></script>
   
    <style>
  ::-webkit-scrollbar {
    width: 10px;
}
 ::-webkit-scrollbar-track
{
	-webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.9);
	background-color: #F5F5F5;
}
	::-webkit-scrollbar-thumb
	{
	background:#0dc4c4;	
	border: 2px;
}
 ::-webkit-scrollbar-track:hover{
 background-color:#ffffff;
 -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0);
  }

::-webkit-scrollbar-thumb:hover{
	background: #04585b;	
border-radius: 10px;
 }

	

body{
background:#ffffff;
    overflow-x:hidden;
}
table{
border:none;
}


.dropdown-menu ul:first-of-type {
    padding-right:20px;
	}
​
#mai{
border-radius:1px;
}

#hove{

font-size:20px;
color:#ffffff;
font-family:'Roboto';
font-style: normal;
font-weight: 500;
padding:24px 24px 24px 24px;
}

#hove:hover{
	color:#ffffff;
    background-color: #04585b;
	padding:24px 24px 24px 24px;
}
.nav .open > a, .nav .open > a:focus, .nav .open > a:hover {
   background-color: #04585b;
}

#navi:hover{
    background-color: #04585b;
}

.active{
     background-color: #04585b;

}
.SearchIcon
{
margin-top:3px;
    color:#fff;
    
   }
.SearchButton
{
    border-radius:1px;
    width:65px;
   
    padding-top:12%;
    
}
.cart-ico{
    border: 1px solid #ddd;
    float: left;
    font-size: 18px;
   font-family:Roboto;
    padding:12px;
    position: relative;
    
}
.drp{
	border-top:1px solid grey !important;

}

.drp2{
border-radius:1px;
margin-top:5% !important;
border:1px solid #cccccc;
}


.dropdown-menu{
    width: 200px ;
	margin-top:1% !important;
	border:none;
	border-top:1px solid #0dc4c4;
}
  
  .shopping-item {
    border: 1px solid #ddd;
    float: left;
    font-size: 18px;
   font-family:Roboto;
    padding:15px;
    position: relative;
}
.shopping-item a {
	font-size:16px;
    color: #666;
}
.cart-amunt {
    color:#06d3c9 ;
    font-weight: 700;
}
.product-count {
    background: none repeat scroll 0 0 #13f784;
    border-radius: 50%;
    color: #fff;
    font-size: 14px;
    height: 20px;
	width: 20px;    
	padding-top: 1px;
    position: absolute;
    right:-2px;
    text-align: center;
    top:-15px;
    
}

.footer-top-area {
background: none repeat scroll 0 0 #2d2c2c;
color: #999;
padding: 30px 0 110px;
}

.footer-top-top-area {
background: none repeat scroll 0 0 #ffffff;
color: #97a1a3;
padding: 30px 0 110px;
}


.footer-about-us span {
  color:#06d3c9;
}

.footer-wid-title {
  font-family: raleway;
  font-size: 22px;
  font-weight: 100;
  color: #d4dadb;
}

.footer-wid-titli {
  font-family: raleway;
  font-size: 22px;
  font-weight: 100;
  color: #868d8e;
}



.footer-menu ul {
    list-style: outside none none;
    margin: 0;
    padding: 0;
}
.footer-menu ul li {
    border-bottom: 1px dashed #9a9e9e;
    padding: 5px 0;
}

.footer-menu.min ul li {
    border-bottom: 1px solid #dee0e2;
    padding: 5px 0;
}

.footer-menu a {
    display: block;
	text-decoration: none;
    padding: 5px 0;
	color: #999;
}


.footer-social a {
  background: none repeat scroll 0 0 #fff;
  color: #5e5d5d;
  display: inline-block;
  font-size: 20px;
  height: 40px;
  margin-bottom: 10px;
  margin-right: 10px;
  padding-top: 5px;
  text-align: center;
  width: 40px;
  border: 1px solid #5e5d5d;
}

.footer-social a:hover {
color:#ffffff;
background-color:#06d3c9;
border-color: #06d3c9 ;
}

.footer-social {
margin-top: 20px;
}

a {
color: #5a88ca;
}

a:hover {
color: #06d3c9;
}
a:focus{
color: #17a78b;
background:#04585b;
}

.footer-bottom-area {
  background:#000;
  color: #fff;
  padding-bottom: 20px;
}

.footer-card-icon {
  font-size: 40px;
  text-align: right;
  margin-top:10px;
}

.copyright > p {
  margin: 20px 0 0;
}

.fa-stack{
color:#06d3c9;
}

/* this is my main content*/
.grid figure {
	position: relative;
	overflow: hidden;
	cursor: pointer;
	background:#2d2e30;
}

figure.effect-julia img {
       -webkit-transition: opacity 1s, -webkit-transform 1s;
	transition: opacity 1s, transform 1s;
	
}
figure.effect-julia:hover img {
	opacity: 0.4;
	-webkit-transform: scale3d(1.1,1.1,1);

}

.grid figure figcaption {
    
      -webkit-backface-visibility: hidden;
	backface-visibility: hidden;
}

.grid figure figcaption{
	position: absolute;
      
        top: 0;
	left: 0;
	width: 100%;
	height: 100%;
}

figure.effect-julia .btn-group {
    margin-top:100px;
margin-left:-10%;
        -webkit-transition: opacity 0.35s, -webkit-transform 0.35s;
	transform: translate3d(0,350px,0);
}

figure.effect-julia:hover .btn-group {
        -webkit-transform: translate3d(0,0,0);
        transform: translate3d(0,0,0);
}

#owl-demo .item{
  margin: 3px;
}
#owl-demo .item img{
  display: block;
  width: 100%;
  height: auto;
}



/*
mterial styles*/

.single-promo{
border:5px solid #f2f2f2;
padding: 20px 20px 20px 20px;
text-align: center;
}

.single-promo i{
font-size: 24px;
    font-weight: 200;
}

#ic{
color:#06d3c9;
font-size:50px;
}
#ic:hover{
color:#04585b;
}

.carousel-indicators li {
    width: 20px;
    height: 20px;
    margin: 5px;
    background-color: #06d3c9;
   opacity:0.8;    
}
.carousel-indicators .active {
    width: 20px;
    height: 20px;
    margin: 5px;
    background-color: #04585b;
}

.carousel-fade .carousel-inner .item {
  opacity: 0;
  -webkit-transition-property: opacity;
  -moz-transition-property: opacity;
  -o-transition-property: opacity;
  transition-property: opacity;
}
.carousel-fade .carousel-inner .active {
  opacity: 1;
}
.carousel-fade .carousel-inner .active.left,
.carousel-fade .carousel-inner .active.right {
  left: 0;
  opacity: 0;
  z-index: 1;
}
.carousel-fade .carousel-inner .next.left,
.carousel-fade .carousel-inner .prev.right {
  opacity: 1;
}
.carousel-fade .carousel-control {
  z-index: 2;
}

.carousel-control.left, .carousel-control.right {
   background-image:none !important;
   filter:none !important;
}
.carousel .carousel-control { visibility: hidden; }
.carousel:hover .carousel-control { visibility: visible; } 

.carousel-caption {
    
}
.carousel-caption h2, .carousel-caption h3 {
    margin-top: -40%;
    font-weight: 300;
    letter-spacing: 14px;
    text-transform: uppercase;
} 
.carousel-caption h2 span, .carousel-caption h3 span{
    font-weight: 800;
    color: #2fdab8;
}
.carousel-caption p {
    letter-spacing: 12px;
    font-weight: 600;
    color: #ffb900;
    
}



.main-pro {
border:1px solid #edeef2;

height:100%;
width:100%;
padding:3% 0% 73% 0%;
}

.grid figure {
	position: relative;
	overflow: hidden;
	text-align: center;
	}

.grid figure figcaption {
	padding: 2em;
	color: #fff;
	text-transform: uppercase;
	font-size: 1.25em;
	-webkit-backface-visibility: hidden;
	backface-visibility: hidden;
}

.grid figure figcaption,
.grid figure figcaption > a {
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
        margin-top:0px;
        
}

figure.effect-apollo {
	background: black;
}

figure.effect-apollo img {
	
	-webkit-transition: opacity 0.35s, -webkit-transform 0.35s;
	transition: opacity 0.35s, transform 0.35s;
	-webkit-transform: scale3d(1.05,1.05,1);
	transform: scale3d(1.05,1.05,1);
}

figure.effect-apollo figcaption::before {
	position: absolute;
	top: -10px;
	left: 0;
	width: 100%;
	height: 100%;
	background: rgba(255,255,255,0.5);
	content: '';
	-webkit-transition: -webkit-transform 0.6s;
	transition: transform 0.6s;
	-webkit-transform: scale3d(1.9,1.4,1) rotate3d(0,0,1,45deg) translate3d(0,-100%,0);
	transform: scale3d(1.9,1.4,1) rotate3d(0,0,1,45deg) translate3d(0,-100%,0);
}

figure.effect-apollo p {
	position: absolute;
	right: 0;
	bottom: 0;
        margin: 1% 2% 3% 1%;
	padding: 0 1%;
	border-right: 4px solid #fff;
	text-align: right;
	opacity: 0;
	-webkit-transition: opacity 0.35s;
	transition: opacity 0.35s;
}

figure.effect-apollo h3 {
    margin-top:-6%;
    color: #ffffff;
	-webkit-transition: opacity 0.35s, -webkit-transform 0.35s;
	-webkit-transform: translate3d(-360px,0,0);
}

figure.effect-apollo:hover img {
	opacity: 0.2;
	-webkit-transform: scale3d(1,1,1);
	transform: scale3d(1,1,1);
}

figure.effect-apollo:hover figcaption::before {
	-webkit-transform: scale3d(1.9,1.4,1) rotate3d(0,0,1,45deg) translate3d(0,100%,0);
	transform: scale3d(1.9,1.4,1) rotate3d(0,0,1,45deg) translate3d(0,100%,0);
}

figure.effect-apollo:hover p {
	opacity: 1;
	-webkit-transition-delay: 0.1s;
	transition-delay: 0.1s;
}

figure.effect-apollo:hover h3 {
	opacity: 1;
	-webkit-transform: translate3d(0,0,0);
	transform: translate3d(0,0,0);
}



/*new top header*/
.header {
    background:#04585b ;


}
.header ul li {
    display: inline-block;
   
    text-align: center;
    color: #ffffff;
    font-size: 13px;
    padding: 7px 0;
    letter-spacing: 1px;
    white-space: pre;
}


.header ul li a {
     color: #ffffff;
    text-decoration: none;
}
.header ul li i {
    margin-right: 12px;
    top: 2px;
    color: #2fdab8;
 
}
.header-right {
    text-align: right;
}
.header-left{
    text-align: left;	
}



</style>
</head>
<body ng-app='app' ng-controller="myctl2" >
<div class="header" id="home">
	<div class="container">
	<div class="row">	
            <ul>
                <div class="col-md-3 col-sm-6 col-xs-12">
		    <li > <a href="" data-toggle="modal" data-target="#myModal" ><i class="fa fa-unlock-alt" aria-hidden="true"></i> Sign In                      |</a></li>
		</div>
                <div class="col-md-3 col-sm-6 col-xs-12">
                    <li> <a href="" data-toggle="modal" data-target="#myModal2"><i class="fa fa-pencil-square-o" aria-hidden="true"></i> Sign Up                    |</a></li>
		</div >
                <div class="col-md-3 col-sm-6 col-xs-12">
                    <li><i class="fa fa-phone" aria-hidden="true"></i> Call : 9582636339                 |</li>
		</div>
                <div class="col-md-3 col-sm-6 col-xs-12">  
                <li><i class="fa fa-envelope-o" aria-hidden="true"></i> aimshah001@gmail.com        |</li>
		</div>
            </ul>
            </div>
	</div>
</div>

<div class="head" style="margin-top:2%" >
    <div class="row" >
<div class="col-md-2" style="margin-left:8%">
<h2>I<span>Sikki</span></h2>
</div>
  <div class="col-md-6">
  <div style="margin-left:4%;margin-top:2%; margin-right:1%">
    <div class="input-group">
       
	   <li class="dropdown input-group-btn">
          <button href="#" id="drop" class="dropdown-toggle input-lg shopping-item" data-toggle="dropdown" style="font-size:16px;border-radius:1px;background:#edeef2" aria-expanded="false">Category	 <span class="caret"></span></button>
          <ul class="dropdown-menu drp" role="menu">
                <li><a ui-sref="nav3">All Categories</a></li>
            <li ng-repeat="y in cate"><a ui-sref="nav3({val:'{{y.cat_name}}'})" >{{y.cat_name}}</a></li>
            <li class="divider"></li>
          </ul>
        </li>
  
<input type="text" style="border-radius:1px" ng-model='search' class="form-control input-lg SearchBar" placeholder="Search for...">
      <span class="input-group-btn">
        <a class="SearchButton btn input-lg"  style="background:#04585b " >
            <span class=" glyphicon glyphicon-search SearchIcon" style="font-size:25px"></span>
        </a>
      </span>
    </div><!-- /input-group -->
  </div>
  </div><!-- /.col-lg-6 -->
<div class="col-md-3 col-sm-6 col-xs-12" >
<div class="input-group dropdown" id="drop2" style="margin:4% 12% 0 12%">
                    
                        <a class="shopping-item dropdown-toggle" id="menu1" type="button" data-toggle="dropdown" style="text-decoration: none !important;color:#5e5f60 " >CART - <span class="cart-amunt"> ₹ 0.00</span> <span class="product-count">0</span></a>
					
						<a class="dropdown-toggle cart-ico" id="menu1" type="button" data-toggle="dropdown" style="width:60px;background:#edeef2"><i class="glyphicon glyphicon-shopping-cart" style="margin-left:2px;color:#5e5f60;font-size:25px"></i></a> 
                    
					<ul class="dropdown-menu dropdown-menu-right drp2" role="menu" aria-labelledby="menu1">
                                    <!-- ngRepeat: cartItem in cartItems track by $index -->
                                    <li>
                                        <div class="clearfix cart-total">
                                            <div class="pull-right">
                                                <span class="text">Sub Total :</span><span class="price ng-binding">£ 0.00</span>
                                            </div>
                                            <div class="clearfix"></div>
                                            <a href="cart.html" style="border-radius:1px;width:70%;margin-left:15%" class="btn btn-upper btn-primary btn-block m-t-20">Checkout</a>
                                        </div><!-- /.cart-total-->
                                    </li>
                            </ul>
							
					</div></div>
  
  </div><!-- /.row -->

  
  <div class="mainmenu-area" style="background:#06d3c9;margin-top:2%">
        <div class="container">
            <div class="row">
                <div class="navbar-header">
                    <button id="navi" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span style="color:#ffffff" class="glyphicon glyphicon-th-list"></span>
                    </button>
                </div> 
                <div class="navbar-collapse collapse .menu--shylock">
        <ul class="nav navbar-nav">
			<li class="active "><a id="hove"  href="#/">HOME</a></li>
			<li class="dropdown mennu">
				<a href="#" id="hove" class="dropdown-toggle" data-toggle="dropdown"  aria-expanded="false">MOBILE PHONES</a>				
				 <ul class="dropdown-menu" role="menu">
         <li class="dropdown-header left" style="text-align:left">blas</li>
          <li><a href="#">one</a></li>
          <li><a href="#">two</a></li>
          <li><a href="#">three</a></li>
          <li><a href="#">four</a></li>
			<li class="divider"></li>
          
			<li class="dropdown-header" style="">baldy</li>
		  <li><a href="#">blah</a></li>
          <li><a href="#">blah blah</a></li>
          <li><a href="#">blah blah blah</a></li>
      </ul>		
			</li>
            <li class="dropdown mennu">
    			<a href="#" id="hove" class="dropdown-toggle" data-toggle="dropdown">CARS</a>				
				 <ul class="dropdown-menu" role="menu">
         <li class="dropdown-header left" style="text-align:left">blas</li>
          <li><a href="#">one</a></li>
          <li><a href="#">two</a></li>
          <li><a href="#">three</a></li>
          <li><a href="#">four</a></li>
			<li class="divider"></li>
          
			<li class="dropdown-header" style="">baldy</li>
		  <li><a href="#">blah</a></li>
          <li><a href="#">blah blah</a></li>
          <li><a href="#">blah blah blah</a></li>
      </ul>
  			
			</li>
			
            <li class="dropdown mennu"><a href="#" id="hove" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">OTHER PRODUCT</a>
			<ul class="dropdown-menu" role="menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li class="divider"></li>
          </ul>
		</li>
		
		</ul>
	
                </div>  
            </div>
        </div>
    </div> <!-- End mainmenu area -->
    </div>    
    
   
   <!-- main content area-->
        
    <div class="container-fluid" >
        <div ui-view></div> 
</div>

    
   


   <div class="container">
       </hr>
   <div id="owl-demo" class="owl-carousel owl-theme">
       <div class="item"><img src="brand1.png" alt="Owl Image"></div>
       <div class="item"><img src="brand2.png" alt="Owl Image"></div>
       <div class="item"><img src="brand3.png" alt="Owl Image"></div>
       <div class="item"><img src="brand4.png" alt="Owl Image"></div>
       <div class="item"><img src="brand5.png" alt="Owl Image"></div>
       <div class="item"><img src="brand6.png" alt="Owl Image"></div>
       <div class="item"><img src="brand1.png" alt="Owl Image"></div>
       <div class="item"><img src="brand2.png" alt="Owl Image"></div>
 
</div> </div>
 <hr>
 
 <div class="footer-top-top-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-6">
				<div class="footer-about-us">
                        <h2>I<span>Sikki</span></h2>
                        
						<div class="footer-social">
                            <a href="#" target="_blank"><i class="fa fa-facebook"></i></a>
                            <a href="#" target="_blank"><i class="fa fa-twitter"></i></a>
                            <a href="#" target="_blank"><i class="fa fa-youtube"></i></a>
                            <a href="#" target="_blank"><i class="fa fa-linkedin"></i></a>
                        </div>
                    </div>
                </div>
                
                <div class="col-md-3 col-sm-6">
                    <div class="footer-menu">
                        <h2 class="footer-wid-titli">OPENING TIME</h2>
                                
                                    <div class="module-body outer-top-xs">
                                        <div class="">
                                            <table class="table borderless">
                                                <tbody>
                                                    <tr><td>Monday-Friday:</td><td class="pull-right">9.00 To 18.00</td></tr>
                                                    <tr><td>Saturday:</td><td class="pull-right">9.00 To 16.00</td></tr>
                                                    <tr><td>Sunday:</td><td class="pull-right">Team Recharging</td></tr>
                                                </tbody>
                                            </table>
                                        </div>
                                        <p style="font-weight:bold">Hot Line: 9582636339 </p>
                            </div>
                    </div>
                </div>
                
				<div class="col-md-3 col-sm-6" style="margin-left:5%">
                    <div class="footer-menu min">
                        <h2 class="footer-wid-titli">INFORMATION</h2>
                        <div class="module-body outer-top-xs">
                                        <ul class="toggle-footer" style="">
                                            <li class="media">
                                                <div class="pull-left">
                                                    <span  class="icon fa-stack fa-lg">
                                                        <i class="fa fa-circle fa-stack-2x"></i>
                                                        <i class="fa fa-map-marker fa-stack-1x fa-inverse"></i>
                                                    </span>
                                                </div>
                                                <div class="media-body">
                                                    <p>321 Las Vegas Kalka Ji New Delhi</p>
                                                </div>
                                            </li>
                                            <li class="media">
                                                <div class="pull-left">
                                                    <span class="icon fa-stack fa-lg">
                                                        <i class="fa fa-circle fa-stack-2x"></i>
                                                        <i class="fa fa-mobile fa-stack-1x fa-inverse"></i>
                                                    </span>
                                                </div>
                                                <div class="media-body">
                                                    <p>9582636339 </p>
                                                </div>
                                            </li>
                                            <li class="media">
                                                <div class="pull-left">
                                                    <span class="icon fa-stack fa-lg">
                                                        <i class="fa fa-circle fa-stack-2x"></i>
                                                        <i class="fa fa-envelope fa-stack-1x fa-inverse"></i>
                                                    </span>
                                                </div>
                                                <div class="media-body">

                                                    <span>Aimshah001@gmail.com</span>
                                                </div>
                                            </li>

                                        </ul>
                                    </div>


						 
                    </div>
                </div>
                
            </div>
        </div>
    </div>
 
 <div class="footer-top-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
              <div class="col-md-3 col-sm-6">
                    <div class="footer-menu">
                        <h2 class="footer-wid-title">QUICK LINKS</h2>
                        <ul >
                            <li><a href="#">About US</a></li>
                            <li><a href="#">Privacy Policy</a></li>
                            <li><a href="#">Terms & Condition</a></li>
                            </ul>                        
                    </div>
                </div>
                
                <div class="col-md-3 col-sm-6">
                    <div class="footer-menu">
                        <h2 class="footer-wid-title">HELP & SUPPORT</h2>
                        <ul>
                            <li><a href="#">Refund & Returns</a></li>
                            <li><a href="#">Shipping Policy & FAQ</a></li>
                            <li><a href="#">Site Map</a></li>
                         </ul>                        
                    </div>
                </div>
                
				<div class="col-md-3 col-sm-6">
                    <div class="footer-menu">
                        <h2 class="footer-wid-title">CONTACT US</h2>
                        <ul>
                            <li class="col-md-5">321 Las Vegas Kalka Ji New Delhi</li>
                            <li class="col-md-10">T :9582636339</li>
                            <li class="col-md-10">Company No :77141714</li>
                         </ul>                        
                    </div>
                </div>
                
            </div>
        </div>
    </div> <!-- End footer top area -->
    
	 <div class="footer-bottom-area" style="background:#1c1c1c ">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="copyright">
                        <p>&copy; 2015 eCommerce. All Rights Reserved. <a href="#" target="_blank">ISikki.com</a></p>
                    </div>
                </div>
                
                <div class="col-md-4">
                    <div class="footer-card-icon">
                        <i class="fa fa-cc-discover"></i>
                        <i class="fa fa-cc-mastercard"></i>
                        <i class="fa fa-cc-paypal"></i>
                        <i class="fa fa-cc-visa"></i>
						 <i class="fa fa-cc-amex"></i>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End footer bottom area -->
 
   
</body>
</html>