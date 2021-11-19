public static <T, O> T invoking(O object, java.lang.Class<T> specificClass) {
    return com.oracle.bedrock.deferred.DeferredHelper.invoking(new com.oracle.bedrock.deferred.Existing<T>(object, specificClass));
}