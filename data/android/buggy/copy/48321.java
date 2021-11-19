@org.junit.Before
public void setUp() throws java.lang.Exception {
    engine = new simulation.Engine(new simulation.schedulers.FIFOScheduler());
    network = new factories.ShortestPathNetworkFactory().network(6);
    collector = new org.junit.rules.ErrorCollector();
}