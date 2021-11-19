public void openConnection() {
    try {
        manager = factory.createEntityManager();
    } catch (java.lang.Exception e) {
        throw new Exceptions.DatabaseException(e.getMessage());
    } finally {
        this.closeManager();
    }
}