public static java.lang.String resourceProviderFromResourceId(java.lang.String id) {
    if (id == null) {
        return null;
    }
    return com.microsoft.azure.management.resources.fluentcore.arm.ResourceId.parseResourceId(id).providerNamespace();
}