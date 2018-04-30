<%-- 
    Document   : AddPruduct
    Created on : 18 Jun, 2017, 11:33:59 PM
    Author     : Sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>product Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="angular/angular.min.js" type="text/javascript"></script>
        <script src="jquery/jquery-3.1.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <style>
            #amg{float: left;}
            #second{
               
            padding:0 20px 10px 20px;
               margin-top:4.3%; 
            
        </style>
    </head>
    <body style="background:#777"  ng-app="mymod" >
        
            
            <nav class="navbar navbar-inverse navbar-fixed-top">
<div class="container-fluid" >
<div class="navbar-header"><a class="navbar-brand active" href="#">Admin</a></div>

<ul class="nav navbar-nav" >
<li><a href="#" data-toggle="modal" data-target="#myModal">Add Product</a></li>
<li><a href="#" data-toggle="modal" data-target="#myModal2">Add Category</a></li>

</ul>
</div>
</nav>
        
  

<div class="modal fade" id="myModal2" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Enter Category Details</h4>
        </div>
        <div class="modal-body">
          <form id="categor" action="AddCates" mehtod="post" >
                <p id="done" class="btn btn-block" style="background:#254747;color:#ffffff"></p>
                
            <br><input type="text" class="form-control" placeholder="Enter Category Id" name="catid">
        <br><input type="text" class="form-control" placeholder="Enter Category Name" name="catname">
        <span id="exist" style="color:#ff0000"></span>
        <br><input type="submit" class="btn btn-block btn-lg btn-primary" value="submit">
        </form> 
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
        
        <div id="second" class="container thumbnail" ng-controller="myctl" > 
       
            <h2 class="col-md-12">products</h2>
       <table class="table table-bordered table-hover" >
           <thead> <tr>
                <th class="col-md-2">P-Image</th>
                <th>P-Image-Name</th>
                <th>P-ID</th>
                <th>P-Name</th>
                <th>P-Price</th>
                <th>P-Date</th>
                <th>P-Supplier</th>
                <th>P-Description</th>
                <th>CatID</th>
                <th colspan="2" class="col-md-1">Action</th>
               </tr></thead>
            <tr ng-repeat="x in person">
                <td><img src="data:image/png;base64,{{x.p_photo}}" width="20%"></td>
                <td>{{x.p_imagename}}</td>
                <td>{{x.p_id}}</td>
                <td>{{x.p_name}}</td>
                <td>{{x.p_price|currency:'$'}}</td>
                <td>{{x.p_date}}</td>
                <td>{{x.p_supplier}}</td>
                <td>{{x.p_description}}</td>
                <td>{{x.catid}}</td>
               <td><a class="btn btn-danger btn-sm" href="deletep?action=delete&p_id={{x.p_id}}"><span class="glyphicon glyphicon-trash">Delete</span></a></td>
            <td><a class="btn btn-success btn-sm" href="deletep?action=update&p_id={{x.p_id}}"><span class="glyphicon glyphicon-pencil">Update</span></a></td>
           
            </tr>
        </table>
       </div>
        
        <div class="container thumbnail" ng-controller="myctl2">
  
                    <div  class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Enter Product Details</h4>
        </div>
        <div class="modal-body">
             <form action="AddProduct" mehtod="post">
        <div class="form-inline">
            <input class="btn btn-default col-md-5" type="file" name="pimage" accept="image/gif,image/png,image/jpg" value="upload image" >
        <input class="form-control" type="text" name="product" placeholder="Enter Image name" id="amg">
        </div>
        <br><br><br><input type="text" class="form-control" placeholder="Enter product Name" name="product">
        <br><input type="text" class="form-control" placeholder="Enter product Price in Rupees" name="product">
        
        <br><label>Select Category Name</label><select class="form-control" name="product">
            <option ng-repeat="y in cate">{{y.cat_name}}</option>
        </select>
      
        <br><input type="text" class="form-control" placeholder="Enter supplier" name="product">
        <br><textarea rows="3"  class="form-control" placeholder="Enter product description" name="product"></textarea>
        <br><input type="submit" class="btn btn-block btn-lg btn-info" name value="submit">
        </form>  
        
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
            
            
            <h2 class="col-md-12">Categories</h2>
       
            <table  class="table table-bordered table-hover">
           <thead> <tr>
                <th>Cate-ID</th>
                <th>Cate-Name</th>
                <th>Cate-Date</th>
                <th colspan="2" class="col-md-1">Action</th>
               </tr></thead>
            <tr ng-repeat="x in cate">
                <td>{{x.cat_id}}</td>
                <td>{{x.cat_name}}</td>
                <td>{{x.cat_date}}</td>
                 <td><a class="btn btn-danger btn-sm" href="deletec?action=delete&p_id={{x.cat_id}}"><span class="glyphicon glyphicon-trash">Delete</span></a></td>
            <td><a class="btn btn-success btn-sm" href="deletec?action=update&p_id={{x.cat_id}}"><span class="glyphicon glyphicon-pencil">Update</span></a></td>
           
            </tr>
       
       </table>
        
        </div>
        <h2>{{cate}}</h2>
       
        
        
<!--        <script>
   var app=angular.module("mymod",[]);
    app.controller('myctl', function($scope){
       $scope.res=${list}; 
    });     
    
     </script> -->

<script>
         var app=angular.module("mymod",[]);
            app.controller("myctl",function($scope,$http){
               var url="showphotu";
               $http.get(url).then(function(data){
                   $scope.person=data.data;
               });
                
            });
            app.controller("myctl2",function($scope,$http){
               var url="showcate";
               $http.get(url).then(function(data){
                   $scope.cate=data.data;
               });
                
            });
            
            
            
    </script>
   


    <script>

    $(document).ready(function(){
        $("#done").hide();
        
    });

    var form = $('#categor');
 form.submit(function () {

 $.ajax({
 type: form.attr('method'),
 url: form.attr('action'),
 data: form.serialize(),
 success: function (data) {
 var result=data; 

   
if(result.indexOf("exist")> -1){
 $("#exist").html("Category already Exist");   
}
if(result.indexOf("done")> -1){
        $("#done").show();
            $("#done").html("Data inserted");
    
}
 }
 });
 return false;
 });
 
    </script>    
 
    
    <!--    <script>
// var form = $('#shu');
// form.submit(function () {
//
// $.ajax({
// type: form.attr('method'),
// url: form.attr('action'),
// data: form.serialize(),
// success: function (data) {
// var result=data; 
//
//$('#bk').html(result);
// 
//     var tr;
//        for (var i = 0; i < result.length; i++) {
//            tr = $('<tr/>');
//            
//            tr.append("<td>" + result[i].p_photo + "</td>");
//            tr.append("<td>" + result[i].p_imagename + "</td>");
//            tr.append("<td>" + result[i].p_price + "</td>");
//            tr.append("<td>" + result[i].p_date + "</td>");
//            tr.append("<td>" + result[i].p_supplier + "</td>");
//            tr.append("<td>" + result[i].p_description + "</td>");
//            tr.append("<td>" + result[i].p_catid + "</td>");
//           
//            $('table').append(tr);
//    }     
// }
// });
// return false;
// }); 


       </script>-->
        </body>
</html>
