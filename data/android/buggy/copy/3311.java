public void configure() {
    binder().requireExplicitBindings();
    bind(com.google.inject.JitBindingsTest.FooBar.class);
    expose(com.google.inject.JitBindingsTest.FooBar.class);
}