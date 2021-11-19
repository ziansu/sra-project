public void markAsConnected(com.emc.storageos.auth.impl.LdapOrADServer server) {
    connectedServers.add(server);
    disConnectedServers.remove(server);
    com.emc.storageos.auth.impl.LdapServerList.log.info("Change back to connected ldap server {}. Now all connected servers are {}", server, connectedServers);
}