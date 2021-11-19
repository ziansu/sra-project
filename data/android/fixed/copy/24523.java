private void createDB() {
    boolean dbExist = DBExists();
    if (!dbExist) {
        this.getReadableDatabase();
        copyDBFromResource();
    }
    this.getReadableDatabase();
    copyDBFromResource();
}