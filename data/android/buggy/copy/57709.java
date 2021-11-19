@org.junit.BeforeClass
public static void setUpClass() throws java.lang.Exception {
    com.flightstats.hub.cluster.SpokeDecommissionClusterTest.curator = com.flightstats.hub.test.Integration.startZooKeeper();
    com.flightstats.hub.util.HubUtils hubUtils = new com.flightstats.hub.util.HubUtils(com.flightstats.hub.app.HubBindings.buildJerseyClientNoRedirects(), com.flightstats.hub.app.HubBindings.buildJerseyClient());
    com.flightstats.hub.cluster.SpokeDecommissionClusterTest.cluster = new com.flightstats.hub.cluster.SpokeDecommissionCluster(com.flightstats.hub.cluster.SpokeDecommissionClusterTest.curator, hubUtils);
}