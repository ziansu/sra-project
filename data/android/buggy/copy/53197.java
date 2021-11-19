public java.lang.String[] getStringArrayParameter(final java.lang.String parameterName) {
    return getStringParameter(parameterName).split(SigmaEC.util.Parameters.LIST_DELIMITER);
}