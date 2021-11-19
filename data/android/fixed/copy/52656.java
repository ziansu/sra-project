@com.hazelcast.simulator.test.annotations.TimeStep(prob = 0.1)
public void destroy(com.hazelcast.simulator.tests.map.MapPredicateTest.ThreadState state) {
    map.destroy();
    initMap();
    (state.operationCounter.destroyCount)++;
}