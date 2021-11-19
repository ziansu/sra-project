@com.bls.resource.Path(value = "/delete")
@com.bls.resource.DELETE
@io.dropwizard.hibernate.UnitOfWork
@com.codahale.metrics.annotation.Timed
@com.codahale.metrics.annotation.ExceptionMetered
public void delete(final com.bls.core.poi.Person person) {
    personDao.delete(person);
}