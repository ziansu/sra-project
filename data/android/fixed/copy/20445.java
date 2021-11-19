public boolean isLoaded(java.lang.Object entity, java.lang.String attributeName) {
    if (java.lang.Boolean.TRUE.equals(org.eclipse.persistence.internal.jpa.EntityManagerFactoryImpl.isLoaded(entity, attributeName, session))) {
        return true;
    }
    return false;
}