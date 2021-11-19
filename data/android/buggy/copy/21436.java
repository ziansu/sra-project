@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON })
public fr.istic.sir.rest.Person addPerson(fr.istic.sir.rest.Person pers) {
    fr.istic.sir.rest.PersonDao dao = new fr.istic.sir.rest.PersonDao();
    dao.create(pers);
    return pers;
}