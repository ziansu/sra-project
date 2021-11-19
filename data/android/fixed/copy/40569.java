@java.lang.Override
protected void configure() {
    bindFactory(org.openur.remoting.resource.errorhandling.MockErrorHandlingFactory.class).to(org.openur.module.integration.security.shiro.OpenUrRdbmsRealm.class);
}