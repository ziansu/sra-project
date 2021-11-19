public static java.lang.String singleStringToSimpleJSON(java.lang.String name, java.lang.String value) {
    return ((("{\"" + (name.replaceAll("\"", "\\\""))) + "\":\"") + (value.replaceAll("\"", "\\\""))) + "\"}";
}