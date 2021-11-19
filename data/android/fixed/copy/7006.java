@java.lang.Override
protected org.grails.datastore.mapping.model.PersistentEntity createPersistentEntity(java.lang.Class javaClass) {
    grails.core.GrailsDomainClass domainClass = ((grails.core.GrailsDomainClass) (grailsApplication.getArtefact(DomainClassArtefactHandler.TYPE, javaClass.getName())));
    if (domainClass == null)
        return null;
    
    return new org.grails.datastore.gorm.config.GrailsDomainClassPersistentEntity(domainClass, this);
}