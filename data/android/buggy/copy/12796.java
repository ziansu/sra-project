@java.lang.Override
public com.microsoft.azure.management.network.Network getNetwork() {
    java.lang.String id = this.networkId();
    return this.networkManager.networks().getById(id);
}