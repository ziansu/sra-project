public static java.lang.String addParameterSingleValueMap(java.lang.String uriString, java.util.Map<java.lang.String, java.lang.String> singleValueMap, java.lang.String charsetType) {
    return com.feilong.core.net.ParamUtil.addParameterArrayValueMap(uriString, com.feilong.core.util.MapUtil.toArrayValueMap(singleValueMap), charsetType);
}