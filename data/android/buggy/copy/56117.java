private void disableInterface(java.lang.String interfaceName) throws java.lang.Exception {
    org.eclipse.kura.linux.net.util.LinuxNetworkUtil.disableInterface(interfaceName);
    this.m_netAdminService.manageDhcpServer(interfaceName, false);
}