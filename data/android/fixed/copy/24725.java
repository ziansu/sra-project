protected boolean destroy(java.lang.String name) {
    org.springframework.cloud.context.scope.GenericScope.BeanLifecycleWrapper wrapper = this.cache.remove(name);
    if (wrapper != null) {
        wrapper.destroy();
        this.errors.remove(name);
        return true;
    }
    return false;
}