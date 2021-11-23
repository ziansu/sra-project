public void unsetConnectionServiceInternal(org.opendaylight.ovsdb.plugin.api.OvsdbConnectionService connectionService) {
    if (this.connectionService.equals(connectionService)) {
        this.connectionService = null;
    }
}