@java.lang.Override
public java.lang.String networkId() {
    com.microsoft.azure.SubResource subnetRef = this.inner().subnet();
    if (subnetRef != null) {
        return com.microsoft.azure.management.resources.fluentcore.arm.ResourceUtils.parentResourcePathFromResourceId(subnetRef.id());
    }else {
        return null;
    }
}