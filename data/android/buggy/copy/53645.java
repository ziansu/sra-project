private java.lang.String buildJson(java.util.List<org.valuereporter.ObservedMethod> observedMethods) {
    java.lang.String json = "";
    org.valuereporter.util.JsonMapper.toJson(observedMethods);
    return json;
}