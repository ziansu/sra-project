@java.lang.Override
protected com.microsoft.azure.management.compute.implementation.VirtualMachineCustomImageImpl wrapModel(com.microsoft.azure.management.compute.implementation.ImageInner inner) {
    return new com.microsoft.azure.management.compute.implementation.VirtualMachineCustomImageImpl(inner.name(), inner, this.manager());
}