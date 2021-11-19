public java.lang.reflect.Method getMethod(final org.codelogger.web.context.stereotype.RequestMethod requestMethod) {
    return (requestMethodToMethod) == null ? null : requestMethodToMethod.get(requestMethod);
}