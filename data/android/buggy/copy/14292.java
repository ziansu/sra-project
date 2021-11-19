public java.lang.Boolean getzgdDump() {
    java.lang.String value = props.getProperty("dump");
    return !(value.equalsIgnoreCase("0"));
}