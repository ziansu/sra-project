public com.scaleset.search.QueryBuilder field(java.lang.String... fields) {
    if (fields != null) {
        for (java.lang.String field : fields) {
            this.fields.add(field);
        }
    }
    return this;
}