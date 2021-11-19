public void update(awana.database.Record r) {
    this.firstName = r.getField(0).getData();
    this.lastName = r.getField(1).getData();
}