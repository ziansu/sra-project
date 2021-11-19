@javax.ws.rs.Path(value = "/update")
@javax.ws.rs.POST
@io.dropwizard.hibernate.UnitOfWork
@com.codahale.metrics.annotation.Timed
@com.codahale.metrics.annotation.ExceptionMetered
public com.bls.core.poi.Event update(final com.bls.core.poi.Event event) {
    return eventDao.add(event);
}