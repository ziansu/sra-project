@java.lang.Override
public void stop() throws java.lang.Exception {
    filter.getNodesCollector().stop();
    super.stop();
}