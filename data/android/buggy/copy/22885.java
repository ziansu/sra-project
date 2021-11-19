public void configure() {
    bind(com.google.inject.JitBindingsTest.FooBar.class);
    expose(com.google.inject.JitBindingsTest.FooBar.class);
}