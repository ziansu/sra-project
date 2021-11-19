public java.util.Set<? extends domain.dto.DetailedResource> getResources(domain.dto.DetailedResourceType type) {
    return manager.getResourceContainer().getResourcesOfType(((domain.ResourceType) (type)));
}