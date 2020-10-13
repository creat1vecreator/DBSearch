let requestURL = 'search?';
let request = new XMLHttpRequest();
request.open('GET', requestURL);
request.responseType = 'json';
request.send();
request.onload = function() {
  let Banks = request.response;
  // populateHeader(Banks);
  // showBanks(Bank);
  Banks.print()
}