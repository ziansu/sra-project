@java.lang.Override
public void test() throws java.lang.Exception {
    dk.alexandra.fresco.demo.AggregationDemo<dk.alexandra.fresco.suite.spdz.SpdzResourcePool> app = new dk.alexandra.fresco.demo.AggregationDemo();
    conf.resourcePool.getNetwork().connect(10000);
    app.runApplication(secureComputationEngine, conf.resourcePool);
}