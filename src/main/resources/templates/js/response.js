var requestURL = 'http://rbsearch.herokuapp.com/search?';
var request = new XMLHttpRequest();
request.open('GET', requestURL);
request.responseType = 'json';
request.send();
request.onload = function() {
  var Banks = request.response;
  populateHeader(Banks);
  showBanks(Bank);
}

