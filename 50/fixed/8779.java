private org.hibernate.Session getParallelSession() {
    if (((parallelToSynchronizationSession) == null) && ((sessionFactory) != null)) {
        parallelToSynchronizationSession = sessionFactory.openSession();
    }
    return parallelToSynchronizationSession;
}