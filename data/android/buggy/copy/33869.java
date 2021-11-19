public final void saveResource(net.es.netshell.api.Resource resource) throws java.io.IOException {
    this.resources.put(resource.getResourceName(), resource.getResourceClassName());
    resource.save(this);
    this.save(this);
}