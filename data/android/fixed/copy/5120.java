private void synchronizePersisterState(org.grails.orm.hibernate.support.AbstractPreDatabaseOperationEvent event, java.lang.Object[] state) {
    org.hibernate.persister.entity.EntityPersister persister = event.getPersister();
    synchronizePersisterState(event, state, persister, persister.getPropertyNames());
}