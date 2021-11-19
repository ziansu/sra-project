@org.junit.Test
public void test() throws java.lang.Exception {
    init(com.orientechnologies.orient.server.distributed.scenariotest.SERVERS);
    prepare(false);
    executeTestsOnServers = new java.util.ArrayList<com.orientechnologies.orient.server.distributed.ServerRun>(serverInstance);
    execute();
}