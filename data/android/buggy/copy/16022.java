protected org.openflexo.foundation.resource.FlexoResourceType.FlexoResourceTypeFactory getFlexoResourceTypeFactory() {
    if ((resourceTypeFactory) == null) {
        resourceTypeFactory = new org.openflexo.foundation.resource.FlexoResourceType.FlexoResourceTypeFactory(this);
    }
    return resourceTypeFactory;
}