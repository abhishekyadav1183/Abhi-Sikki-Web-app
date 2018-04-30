/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var app=angular
                .module("app",['ui.router'
        ]).config(['$urlRouterProvider','$stateProvider',function($urlRouterProvider,$stateProvider){
                $urlRouterProvider.otherwise('/');
                $stateProvider
                        .state('home',{
                    url:'/',
                    templateUrl:'templates/mterial.html'
                });
        }]);
        
        
        
        
        
            
        app.controller("oneCtrl",function($scope,$http){
               var url="showphotu";
               $http.get(url).then(function(data){
                   $scope.product=data.data;
               });
                var url="showcate";
               $http.get(url).then(function(data){
                   $scope.cate=data.data;
               });
            });
            
              
        app.directive('tooltip', function(){
        return {
        restrict: 'A',
        link: function(scope, element, attrs){
            $(element).hover(function(){
                // on mouseenter
                $(element).tooltip('show');
            }, function(){
                // on mouseleave
                $(element).tooltip('hide');
            });
        }
    };
});
 
        app.directive('pt', function(){
        return {
        restrict: 'A',
        link: function(scope, element, attrs){
            $(element).hover(function(){
                // on mouseenter
                $(element).css('color',"#07d1ff");
            }, function(){
                // on mouseleave
                $(element).css('color',"#60656d");
            });
        }
    };
});
 
 
        app.directive('bt1', function(){
        return {
        restrict: 'A',
        link: function(scope, element, attrs){
            $(element).hover(function(){
                // on mouseenter
                $(element).css('background',"#18ccb4");
            }, function(){
                // on mouseleave
                $(element).css('background',"#c4c4c4");
            });
        }
    };
});
   app.directive('bt2', function(){
    return {
        restrict: 'A',
        link: function(scope, element, attrs){
            $(element).hover(function(){
                // on mouseenter
                $(element).css('background',"#014c42");
            }, function(){
                // on mouseleave
                $(element).css('background',"#74797c");
            });
        }
    };
});
 
 
 app.directive('img', function(){
    return {
        restrict: 'A',
        link: function(scope, element, attrs){
            $(element).hover(function(){
                // on mouseenter
                $(element).css({'transform': 'scale('+ $(element).attr('data-scale') +')'});

            }, function(){
                // on mouseleave
                $(element).animate({width: "100%"}, 'slow');

                
            });
        }
    };
});