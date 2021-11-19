public java.lang.Float getfloatValue() {
    if ((intValue) != null) {
        return new java.lang.Float(intValue);
    }
    if ((floatValue) != null) {
        return floatValue;
    }
    return new java.lang.Float(0.0);
}