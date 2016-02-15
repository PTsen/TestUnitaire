var cool=require('cool-ascii-faces');
var express = require('express');
var app = express();

app.set('port', (process.env.PORT || 5000));

app.use(express.static(__dirname + '/public'));

// views is directory for all template files
app.set('views', __dirname + '/views');
app.set('view engine', 'ejs');

app.get('/', function(request, response) {
  response.render('pages/index')
});

app.get('/purple1', function(request, response) {
  response.send(cool());
});
app.get('/purple2', function(request, response) {
  response.send(cool());
});
app.get('/purple3', function(request, response) {
  response.send(cool());
});
app.get('/blue1', function(request, response) {
  response.send(cool());
});
app.get('/blue2', function(request, response) {
  response.send(cool());
});
app.get('/blue3', function(request, response) {
  response.send(cool());
});
app.get('/green1', function(request, response) {
  response.send(cool());
});
app.get('/green2', function(request, response) {
  response.send(cool());
});
app.get('/green3', function(request, response) {
  response.send(cool());
});

app.listen(app.get('port'), function() {
  console.log('Node app is running on port', app.get('port'));
});

