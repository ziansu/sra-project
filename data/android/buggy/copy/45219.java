public long persistedIdOf(java.lang.Object record) {
    java.lang.Long id = org.rapidoid.beany.Beany.getIdIfExists(record);
    if (id == null) {
        return insert(record);
    }else {
        return id;
    }
}