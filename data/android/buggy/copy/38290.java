private void disableInterface(java.lang.String interfaceName) throws java.lang.Exception {
    org.eclipse.kura.linux.net.util.LinuxNetworkUtil.disableInterface(interfaceName);
    org.eclipse.kura.linux.net.util.LinuxNetworkUtil.powerOnEthernetController(interfaceName);
    m_netAdminService.manageDhcpServer(interfaceName, false, null);
}