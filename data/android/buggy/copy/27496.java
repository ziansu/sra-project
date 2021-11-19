public void setParameter(java.lang.String parameter, java.lang.String value) {
    body.replace((("%" + parameter) + "%"), value);
}