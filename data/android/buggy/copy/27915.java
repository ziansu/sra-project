public void save(java.lang.Object o) {
    new database.DBClinReason().deleteAndCommit(((beans.relation.Connection) (o)));
}