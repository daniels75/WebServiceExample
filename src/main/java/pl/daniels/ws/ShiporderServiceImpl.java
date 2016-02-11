package pl.daniels.ws;

import javax.jws.WebService;

import pl.daniels.common.ShipData;
import pl.daniels.jaxb.Shiporder;

@WebService(endpointInterface = "pl.daniels.ws.ShiporderService")
public class ShiporderServiceImpl implements ShiporderService {

	@Override
	public String getOrder(String order) {
		return "status ok - Result: " + order;
	}

	@Override
	public String getShipDetails(ShipData shipData) {
		return shipData.toString();
	}

	@Override
	public String getShiporder(Shiporder shiporder) {
		return shiporder.toString();
	}

}
