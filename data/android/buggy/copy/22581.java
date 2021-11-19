protected void buildChildren(org.apache.sling.api.resource.ResourceResolver resolver, java.lang.String mapPath) {
    org.apache.sling.api.resource.Resource parent = resolver.getResource(mapPath);
    org.apache.sling.pipes.client.MappingUse.logger.info("initiating mapping use with resource {}", parent.getPath());
    children = org.apache.commons.collections.IteratorUtils.toList(parent.listChildren());
}