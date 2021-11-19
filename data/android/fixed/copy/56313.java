@java.lang.Override
public com.microsoft.azure.management.network.implementation.ApplicationGatewayFrontendImpl withPrivateIpAddressDynamic() {
    this.inner().withPrivateIPAddress(null).withPrivateIPAllocationMethod(IPAllocationMethod.DYNAMIC);
    return this;
}