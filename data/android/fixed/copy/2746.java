public void removeField(java.lang.String fieldName) {
    if ((this.excludedFields.indexOf(fieldName.toUpperCase())) < 0) {
        excludedFields.add(fieldName.toUpperCase());
    }
    retrieveAllFields();
}