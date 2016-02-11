package pl.daniels.simple.endpoint;
 
import javax.xml.ws.Endpoint;

import pl.daniels.simple.ws.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9091/ws/hello", new HelloWorldImpl());
    }
 
}