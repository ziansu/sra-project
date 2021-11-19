@java.lang.Override
public void start() throws java.lang.Exception {
    eu.europeana.harvester.cluster.SlaveDaemon.LOG.info("Starting slave");
    slave.start();
}