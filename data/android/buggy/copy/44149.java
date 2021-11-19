public java.lang.String getDataUnit() {
    if ("MB".equalsIgnoreCase(dataUnit)) {
        return java.lang.Long.toString(((dataAmount) * 1024));
    }
    return dataUnit;
}