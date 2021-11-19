public long persistedIdOf(java.lang.Object record) {
    java.lang.Long id = org.rapidoid.beany.Beany.getIdIfExists(record);
    if ((id == null) || (id <= 0)) {
        return insert(record);
    }else {
        return id;
    }
}