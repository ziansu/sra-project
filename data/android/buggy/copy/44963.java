@java.lang.Override
public void run() {
    new com.wowza.wms.plugin.streamresolver.UDPServer(udpPort, this.host, com.wowza.wms.logging.WMSLoggerFactory.getLogger(getClass()), this.debug);
}