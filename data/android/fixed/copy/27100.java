public void close() {
    try {
        if (((entityManager) != null) && (entityManager.isOpen())) {
            entityManager.close();
        }
    } finally {
        config.clearContext();
    }
}