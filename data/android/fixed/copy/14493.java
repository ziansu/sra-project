public java.lang.String getAlgorithm() {
    java.lang.Object prop = getHeader(JoseConstants.HEADER_ALGORITHM);
    return prop == null ? null : prop.toString();
}