@java.lang.Override
public void run() {
    pnnl.goss.tutorial.launchers.AggregatorLauncher.log.debug("Creating aggregator launcher");
    startAggregator();
    setupControlChannel();
}