angular.module('battery', [])
.controller('battery', function($scope, $http) {
    $http.get('http://localhost:8080/batterystats?vehicle=1').
        then(function(response) {
            $scope.battery = response.data;
        });
});