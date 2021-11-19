private void fireSubjectPropertiesChanged(java.lang.String subjectId) {
    if ((eventBus) != null) {
        eventBus.post(org.summerb.approaches.jdbccrud.api.dto.EntityChangedEvent.updated(new org.summerb.microservices.properties.api.dto.SimplePropertiesSubject(appName, domainName, subjectId)));
    }
}