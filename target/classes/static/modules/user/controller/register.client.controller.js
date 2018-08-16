angular.module('user').controller('registerController',['$scope','$state','userService',
    function($scope,$state,userService){
		$scope.user = {};
		$scope.error = {};
		
		$scope.registerUser = function(){
		console.log($scope.user);
		if(($scope.user.password).length< 5 ){
				$scope.error.hasError = true;
        		$scope.error.message = "Security is for your privacy type atleaset 5 characters."
		}
		else if(($scope.user.username).length< 4 )
        		{
        				$scope.error.hasError = true;
                		$scope.error.message = "Dont be lazy type atleast 4 characters for username."
        		}
		else{
			userService.register($scope.user)
			.then(function(response){
				$state.go('todo');
			},function(err){
				console.log(err);
				$scope.error.hasError = true;
				$scope.error.message = "We think this username is taken .Kindly choose anotherone."
			});
		}
		}
	}
]);