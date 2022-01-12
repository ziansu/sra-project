public void setHeader(java.lang.String header, java.lang.String value) {
    if (null == (headers))
        headers = new java.util.HashMap<java.lang.String, java.lang.String>();
    
    headers.put(header, value);
}