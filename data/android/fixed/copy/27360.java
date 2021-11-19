public static java.lang.Object createCollectionKey(java.lang.Object id, org.hibernate.persister.collection.spi.CollectionPersister persister, org.hibernate.engine.spi.SessionFactoryImplementor factory, java.lang.String tenantIdentifier) {
    return new org.hibernate.cache.internal.OldCacheKeyImplementation(id, persister.getKeyType(), persister.getRole(), tenantIdentifier);
}