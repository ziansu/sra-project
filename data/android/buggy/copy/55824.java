private final long valueToLong() {
    java.lang.StringBuffer valueString = new java.lang.StringBuffer();
    valueString.append(this.value);
    return java.lang.Long.parseLong(valueString.toString());
}