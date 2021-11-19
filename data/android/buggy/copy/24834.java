private void addDefaultListener() {
    ddf.catalog.core.ftp.FtpServerStarter.listenerFactory.setPort(port);
    ((org.apache.ftpserver.impl.DefaultFtpServer) (ddf.catalog.core.ftp.FtpServerStarter.server)).getListeners().put(ddf.catalog.core.ftp.FtpServerStarter.DEFAULT_LISTENER, ddf.catalog.core.ftp.FtpServerStarter.listenerFactory.createListener());
}