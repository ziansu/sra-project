@java.lang.Override
protected com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMImpl wrapModel(com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMInner inner) {
    return new com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetVMImpl(inner, this.scaleSet, this.client, this.computeManager);
}