public java.lang.String getValue(long val) {
    if ((this.valuePrefix) != null) {
        return java.lang.String.format("%d.%d", this.valuePrefix.intValue(), val);
    }
    return java.lang.String.format("%d", val);
}