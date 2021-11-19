public final void saveResource(net.es.netshell.api.Resource resource) throws java.io.IOException {
    resource.save(this);
    this.save(this);
}