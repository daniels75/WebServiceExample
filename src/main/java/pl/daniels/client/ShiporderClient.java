package pl.daniels.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import pl.daniels.simple.ws.HelloWorld;
import pl.daniels.ws.ShiporderService;

public class ShiporderClient {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:9092/ws/shiporder?wsdl");
		 
        QName qname = new QName("http://ws.daniels.pl/", "ShiporderServiceImplService");
 
        Service service = Service.create(url, qname);
 
        ShiporderService shiporderService = service.getPort(ShiporderService.class);
 
        System.out.println(shiporderService.getShipOrder("daniels"));
	}

}
