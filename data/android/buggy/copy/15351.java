public static java.lang.String addParameterSingleValueMap(java.lang.String uriString, java.util.Map<java.lang.String, java.lang.String> singleValueMap, java.lang.String charsetType) {
    org.apache.commons.lang3.Validate.notNull(singleValueMap, "singleValueMap can't be null!");
    return com.feilong.core.net.ParamUtil.addParameterArrayValueMap(uriString, com.feilong.core.util.MapUtil.toArrayValueMap(singleValueMap), charsetType);
}