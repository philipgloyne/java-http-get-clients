# Java HTTP GET Clients

This application was created to test the speed of three Java libraries. It repeatively calls HTTP GET requests on a specified URI and records the total laps time. As a control a vanilla client was created using the java.net package. All clients make a request and return the http response body as a String.    

## Clients
- java.net Control Client (java 1.6.x)
- Apache Commons (commons-httpclient 3.1)
- Jersey (jersey-core 1.11)
- RestTemplate (springframework 3.0.5-RELEASE)

## Usage
java -jar [jar-one-jar.jar] [target uri] [number of requests per client]

**example:**
```
java -jar target/java-http-get-clients-2.0.0.2-SNAPSHOT.one-jar.jar http://www.slashdot.org 30 
```
**example output:**
```
== BEGIN ==
Calling HTTP GET on http://www.slashdot.org 30 times
... done
native client takes: 2825ms
... done
jersey client takes: 1838ms
... done
apache client takes: 3724ms
... done
spring client takes: 1553ms
== END ==
```
