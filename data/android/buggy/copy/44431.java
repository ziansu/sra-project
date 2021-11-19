public void removeMigration(java.lang.String fileName) {
    java.io.File file = new java.io.File(fileName);
    execute("DELETE FROM migrations WHERE name = ?", file.getName());
}