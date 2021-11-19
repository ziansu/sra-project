public java.lang.String asString() {
    byte[] bytes = asBytes();
    return null != bytes ? new java.lang.String(asBytes()) : null;
}