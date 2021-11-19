public boolean save(java.lang.String statuses) {
    return db.insertDocument(statuses);
}