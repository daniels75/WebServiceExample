package pl.daniels.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import pl.daniels.common.ShipData;
import pl.daniels.jaxb.Shiporder;

@WebService
//@SOAPBinding(style = Style.RPC)
@SOAPBinding(style = Style.DOCUMENT)
public interface ShiporderService {
	
	@WebMethod
	public String getShipOrder(String shiporder);
	
	@WebMethod
	public String getShipDetails(ShipData shipData);
	
	@WebMethod
	public String getShiporder(Shiporder shiporder);
}
