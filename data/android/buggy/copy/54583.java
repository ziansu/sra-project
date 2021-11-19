@java.lang.Override
public com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetImpl attach() {
    nullifySettingsIfEmpty();
    return this.parent().withExtension(this);
}