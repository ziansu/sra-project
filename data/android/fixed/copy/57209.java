protected java.util.Map<java.lang.String, java.lang.Object> getSuccessResult(java.lang.Object result) {
    java.util.Map<java.lang.String, java.lang.Object> object = createResult(true);
    object.put("root", result);
    return object;
}