@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON })
public fr.istic.sir.rest.Person addPerson(fr.istic.sir.rest.Person pers) {
    fr.istic.sir.rest.PersonDao dao = new fr.istic.sir.rest.PersonDao();
    java.lang.System.out.println(pers.toString());
    dao.create(pers);
    return pers;
}