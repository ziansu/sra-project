@java.lang.Override
protected void releaseResources() {
    Destroyable.Util.tryDestroyAll(registry.values(), javax.enterprise.context.ApplicationScoped.class);
    registry = null;
}