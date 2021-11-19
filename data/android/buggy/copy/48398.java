public java.lang.String toString() {
    return new java.lang.StringBuilder().append(org.automon.utils.Utils.getExceptionTrace(throwable)).append(Utils.LINE_SEPARATOR).append(org.automon.utils.Utils.argNameValuePairsToString(argNamesAndValues)).toString();
}