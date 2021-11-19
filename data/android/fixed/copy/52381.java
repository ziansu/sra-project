void storeAttributeInSession(java.lang.String attribute, java.lang.String parameterName) {
    request.getSession().setAttribute(attribute, parameterName);
}