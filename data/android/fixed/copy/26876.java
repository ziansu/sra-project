public java.lang.String getCC() {
    if ((getHeaderValue("CC")) != null) {
        return getHeaderValue("CC").get(0);
    }
    return null;
}