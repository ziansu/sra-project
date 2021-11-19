public void removeField(java.lang.String fieldName) {
    if ((this.excludedFields.indexOf(fieldName)) < 0) {
        excludedFields.add(fieldName);
    }
    retrieveAllFields();
}