@java.lang.Override
public com.microsoft.azure.management.network.implementation.ApplicationGatewayFrontendImpl withPrivateIpAddressStatic(java.lang.String ipAddress) {
    this.inner().withPrivateIPAddress(ipAddress).withPrivateIPAllocationMethod(IPAllocationMethod.STATIC);
    return this;
}