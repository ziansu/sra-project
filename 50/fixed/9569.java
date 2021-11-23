@java.lang.Override
public void destroy() throws java.lang.Exception {
    LOG.info("ThriftServerConfiguration destroy, shutdown eureka client.");
    eurekaClient.shutdown();
    LOG.info("ThriftServerConfiguration destroy, shutdown rpc server.");
    thriftServer.stop();
}