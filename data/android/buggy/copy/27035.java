@java.lang.Override
public void setNavajoHeader(java.lang.String key, java.lang.Object value) {
    if ((navajoHeaders) == null) {
        httpHeaders = new java.util.HashMap<>();
    }
    httpHeaders.put(key, value.toString());
}