@javax.ws.rs.Path(value = "update")
@javax.ws.rs.Consumes(value = "application/json")
@javax.ws.rs.POST
public boolean updateAirline(cs545.airline.model.Airline airline) {
    airlineService.update(airline);
    return true;
}