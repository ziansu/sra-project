public void setSessionValue(java.lang.Object key, java.lang.Object value) {
    if (value != null) {
        getSessionContext().remove(key);
    }else {
        getSessionContext().put(key, value);
    }
}