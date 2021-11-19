@java.lang.Override
protected void configure() {
    bind(com.asquera.elasticsearch.plugins.http.HttpBasicServer.class).asEagerSingleton();
}