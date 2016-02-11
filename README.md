How to generate client class from wsdl
1. go to src directory
2. run
wsimport -keep -p com.ws.generated  http://localhost:9999/ws/hello?wsdl


3. two styles of WebServices
Document Style - here you have full XSD (available in the wsdl link: http://localhost:9092/ws/shiporder?wsdl)
RPC style  - here you can't use a Shiporder


Shiporder.xsd is copied from w3school page
Shiporder.xml is generated from shiporder.xsd file via Eclipse
Shiporder JAXB class generated from shiporder.xsd file via Eclipse and then used in the ShiporderService 

Tested in the SoapUI 

