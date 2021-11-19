private java.lang.reflect.Method getInitializeDefaultCharsetSingletonMethod() throws java.lang.NoSuchMethodException {
    java.lang.reflect.Method staticInitializer = com.basho.riak.client.core.util.DefaultCharset.class.getDeclaredMethod("initializeDefaultCharsetSingleton", ((java.lang.Class<?>) (null)));
    staticInitializer.setAccessible(true);
    return staticInitializer;
}