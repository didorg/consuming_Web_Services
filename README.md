# Consuming a RESTful Web Service ("Thinking in microservices")
Spring Framework, Spring Boot, Maven, Jetty, Java 1.8

Open ConsumingWebServicesApplication Java Class in:
src->main->java->com.dido.mms.cws and then run the Class

in your browser, put this url:
http://localhost:8080/random

Now you see the json:
{...}

for chrome you need open: 
chrome://extensions/ 
and add -> "JSON Formatter" to format the json result

enter @RequestParam -> ?name=Adam
example: http://localhost:8080/random?name=Adam


Bibliography: https://spring.io/guides/gs/consuming-rest/
