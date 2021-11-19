public void setTimestamp(com.google.appengine.api.datastore.Key Key_timestamp) {
    this.Key_timestamp = Key_timestamp;
    if (Key_timestamp != null)
        Date_timestamp = new java.util.Date(java.lang.Long.parseLong(Key_timestamp.getName()));
    
}