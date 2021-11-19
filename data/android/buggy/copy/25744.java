protected final void setHeader(java.lang.String name, java.lang.String value) {
    if (resp.containsHeader(name)) {
        resp.setHeader(name, value);
    }else {
        addHeader(name, value);
    }
}