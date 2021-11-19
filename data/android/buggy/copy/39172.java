public java.lang.String addInterceptor(com.hazelcast.map.MapInterceptor interceptor) {
    java.lang.String id = com.hazelcast.util.UuidUtil.buildRandomUuidString();
    interceptorMap.put(id, interceptor);
    interceptors.add(interceptor);
    return id;
}