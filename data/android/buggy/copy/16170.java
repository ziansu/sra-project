@java.lang.Override
public com.microsoft.azure.management.network.implementation.ApplicationGatewayImpl withDisabledSslProtocols(com.microsoft.azure.management.network.ApplicationGatewaySslProtocol... protocols) {
    if (protocols == null) {
        return null;
    }
    for (com.microsoft.azure.management.network.ApplicationGatewaySslProtocol protocol : protocols) {
        withDisabledSslProtocol(protocol);
    }
    return this;
}