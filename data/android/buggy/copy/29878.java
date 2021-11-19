public com.google.turbine.binder.env.SimpleEnv<K, V> build() {
    return new com.google.turbine.binder.env.SimpleEnv(com.google.common.collect.ImmutableMap.copyOf(map));
}