private void addBPPropertyToList(java.lang.String propertyName, java.lang.String value, java.util.List<org.ndexbio.model.object.NdexPropertyValuePair> propertyList) {
    if (value != null) {
        org.ndexbio.model.tools.PropertyHelpers.addNdexProperty((((this.bioPaxPrefix) + ":") + propertyName), value, propertyList);
    }
}