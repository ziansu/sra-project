@javax.ws.rs.Path(value = "/remove")
@javax.ws.rs.POST
@io.dropwizard.hibernate.UnitOfWork
@com.codahale.metrics.annotation.Timed
@com.codahale.metrics.annotation.ExceptionMetered
public com.bls.core.poi.Event remove(final com.bls.core.poi.Event event) {
    return eventDao.add(event);
}