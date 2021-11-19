private void addDate(org.apache.solr.common.SolrInputDocument doc, java.util.Date value, boolean mv) {
    addField(doc, "dt", new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", java.util.Locale.ROOT).format(value), mv);
}