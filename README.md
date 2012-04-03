# Java HTTP GET Clients

This application was created to test the speed of three Java libraries. It repeatively calls HTTP GET requests on a specified URI and records the total laps time. As a control a vanilla client was created using the java.net package. All clients make a request and return the http response body as a String.    

## Clients
- java.net Control Client (native)
- Apache Commons (commons-httpclient 3.1)
- Jersey (jersey-core 1.11)
- RestTemplate (Spring framework 3.0.5-RELEASE)

## Usage
java -jar [jar-one-jar.jar] [target uri] [number of requests per client]

**Example:**
java -jar target/java-http-get-clients-2.0.0.2-SNAPSHOT.one-jar.jar http://www.slashdot.org 300 
