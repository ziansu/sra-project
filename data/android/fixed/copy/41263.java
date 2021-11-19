public com.orientechnologies.orient.core.record.ORecordAbstract delete() {
    getDatabase().delete(this);
    return this;
}