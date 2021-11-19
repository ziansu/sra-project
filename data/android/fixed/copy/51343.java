@java.lang.Override
protected void configureRegistry() {
    bind(key).toRegistry(100, java.util.concurrent.TimeUnit.MICROSECONDS);
}