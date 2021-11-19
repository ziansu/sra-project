public void manageDhcpServer(java.lang.String interfaceName, boolean enable, org.eclipse.kura.net.NetworkPair<org.eclipse.kura.net.IP4Address> allowedNetwork) throws org.eclipse.kura.KuraException {
    org.eclipse.kura.linux.net.dhcp.DhcpServerManager.disable(interfaceName);
    if (enable) {
        org.eclipse.kura.linux.net.dhcp.DhcpServerManager.enable(interfaceName);
    }
}