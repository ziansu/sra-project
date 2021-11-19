public boolean isLoaded(java.lang.Object entity) {
    if (org.eclipse.persistence.internal.jpa.EntityManagerFactoryImpl.isLoaded(entity, session).equals(java.lang.Boolean.TRUE)) {
        return true;
    }
    return false;
}