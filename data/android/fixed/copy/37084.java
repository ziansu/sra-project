public final java.util.Map<java.lang.String, java.lang.Object> getDynamicContext(java.util.Map<java.lang.String, java.lang.Object> previousContext) {
    if ((dynamicContext) != null) {
        return dynamicContext.getContext(previousContext);
    }else {
        return previousContext;
    }
}