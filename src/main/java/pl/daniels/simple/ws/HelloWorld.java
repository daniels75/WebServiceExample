package pl.daniels.simple.ws;
 
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import pl.daniels.simple.client.ComplicatedExample;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld{
 
	@WebMethod 
	String getHelloWorldAsString(String name);
	
	@WebMethod
	String generateDocument(ComplicatedExample example);

}