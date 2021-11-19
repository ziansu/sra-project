private void synchronizePersisterState(org.grails.orm.hibernate.support.AbstractPreDatabaseOperationEvent event, java.lang.Object[] state) {
    org.hibernate.persister.entity.EntityPersister persister = event.getPersister();
    java.lang.String[] propertyNames = persister.getPropertyNames();
    synchronizePersisterState(event, state, persister, propertyNames);
}