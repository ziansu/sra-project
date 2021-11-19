public void setField(java.lang.String solr_property, java.lang.String value) {
    if ((value != null) && (!((value = sanitizeString(solr_property, value)).isEmpty())))
        doc.setField(solr_property, value);
    
}