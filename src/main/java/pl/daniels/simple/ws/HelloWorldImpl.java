package pl.daniels.simple.ws;
 
import javax.jws.WebService;

import pl.daniels.simple.client.ComplicatedExample;
 
//Service Implementation
@WebService(endpointInterface = "pl.daniels.simple.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

	@Override
	public String generateDocument(ComplicatedExample example) {
		// TODO Auto-generated method stub
		return example.getName() + " " + example.getDate() + " "+ example.getValue();
	}
	
	
 
}