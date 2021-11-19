@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/allxml")
@javax.ws.rs.Produces(value = "application/xml")
public java.util.List<com.fortech.jaxb.PersonConfig> getAllPersonConfig() {
    personService.getFromDBdataToXML();
    return com.fortech.jaxb.PersonConfig.getAllPersons();
}