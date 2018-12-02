//var uus = document.getElementById('uus');
//$.get("https://ipinfo.io", function(response) {
//    uus.innerHTML += "<p>IP: " +  response.ip + "</p><p>Riik: " + response.country + "</p>";
//}, "jsonp").fail(function () {
//    uus.innerHTML += "<p>IP: viga, ei õnnestunud leida!</p><p>Riik: viga, ei õnnestunud leida!</p>";
//});
var test = document.getElementById('test');
function ipLookUp () {
  $.ajax('https://ipinfo.io')
  .then(
      function success(response) {
          //console.log('User\'s Location Data is ', response);
          //console.log('User\'s Country', response.country);

      },

      function fail(data, status) {
          //console.log('Request failed.  Returned status of',
          //            status);
      }
  );
}