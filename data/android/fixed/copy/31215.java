public void putDouble(java.lang.String key, double value) {
    if (key == null)
        return ;
    
    putString(key, java.lang.String.valueOf(value));
}