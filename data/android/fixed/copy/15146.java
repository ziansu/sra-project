public boolean isLoaded(java.lang.Object entity) {
    if (java.lang.Boolean.TRUE.equals(org.eclipse.persistence.internal.jpa.EntityManagerFactoryImpl.isLoaded(entity, session))) {
        return true;
    }
    return false;
}