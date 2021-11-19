public static java.lang.Object stringToValue(java.lang.String string) {
    java.lang.Object ret = org.json.JSONObject.stringToValue(string);
    if (ret instanceof java.lang.String) {
        return org.json.XML.unescape(((java.lang.String) (ret)));
    }
    return ret;
}