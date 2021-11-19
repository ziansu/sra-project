public javax.persistence.EntityManagerFactory createContainerEntityManagerFactory(javax.persistence.spi.PersistenceUnitInfo persistenceUnitInfo, java.util.Map map) {
    return new com.spaceprogram.simplejpa.EntityManagerFactoryImpl(persistenceUnitInfo, map);
}