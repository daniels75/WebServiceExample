package pl.daniels.endpoint;

import javax.xml.ws.Endpoint;

import pl.daniels.ws.ShiporderServiceImpl;

public class ShiporderPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9092/ws/shiporder", new ShiporderServiceImpl());
	}

}
