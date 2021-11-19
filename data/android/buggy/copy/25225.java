@java.lang.Override
public java.lang.AutoCloseable createInstance() {
    org.opendaylight.vpnservice.fibmanager.FibManagerProvider provider = new org.opendaylight.vpnservice.fibmanager.FibManagerProvider();
    getBrokerDependency().registerProvider(provider);
    provider.setMdsalManager(getMdsalutilDependency());
    provider.setVpnmanager(getVpnmanagerDependency());
    return provider;
}