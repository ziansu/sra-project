public com.kwetter.beans.User getUser() {
    java.util.Map<java.lang.String, java.lang.String> parameterMap = this.externalContext.getRequestParameterMap();
    java.lang.String username = parameterMap.get("u");
    user = this.kwetterService.findByUserName(username);
    return user;
}