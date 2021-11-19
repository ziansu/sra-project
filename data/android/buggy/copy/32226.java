@java.lang.Override
public com.excilys.cdb.model.Computer update(final com.excilys.cdb.model.Computer computer) {
    com.excilys.cdb.persistence.impl.ComputerDaoImpl.LOGGER.info(("Update computer " + computer));
    sessionFactory.getCurrentSession().save(computer);
    return computer;
}