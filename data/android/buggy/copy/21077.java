public void setClientMode(int clientMode) {
    assertTrue(((clientMode == (org.apache.commons.net.ftp.FTPClient.ACTIVE_LOCAL_DATA_CONNECTION_MODE)) || (clientMode == (org.apache.commons.net.ftp.FTPClient.PASSIVE_LOCAL_DATA_CONNECTION_MODE))), org.teiid.resource.adapter.ftp.FtpManagedConnectionFactory.UTIL.getString("ftp_client_clientMode", clientMode));
    this.clientMode = clientMode;
}