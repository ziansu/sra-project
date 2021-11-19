public void putString(java.lang.String key, java.lang.String value) {
    if ((null == key) || (null == value))
        return ;
    
    this.values.put(key, value);
}