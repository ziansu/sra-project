public boolean isLoaded(java.lang.Object entity, java.lang.String attributeName) {
    if (org.eclipse.persistence.internal.jpa.EntityManagerFactoryImpl.isLoaded(entity, attributeName, session).equals(java.lang.Boolean.TRUE)) {
        return true;
    }
    return false;
}