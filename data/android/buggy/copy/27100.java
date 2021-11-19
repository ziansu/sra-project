public void close() {
    try {
        if (entityManager.isOpen()) {
            entityManager.close();
        }
    } finally {
        config.clearContext();
    }
}