void deRegister(org.zoodb.jdo.impl.PersistenceManagerImpl persistenceManagerImpl) {
    synchronized(pms) {
        pms.remove(persistenceManagerImpl);
    }
}