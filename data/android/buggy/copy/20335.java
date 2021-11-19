public static java.lang.String getAppId(javax.servlet.http.HttpServletRequest request) {
    com.pratilipi.data.DataAccessor dataAccessor = com.pratilipi.data.DataAccessorFactory.getDataAccessor();
    java.util.Map<java.lang.String, java.lang.String> facebookCredentials = dataAccessor.getAppProperty(com.pratilipi.common.util.FacebookApi.APP_PROPERTY_ID).getValue();
    return facebookCredentials.get("appId");
}