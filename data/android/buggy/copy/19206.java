@org.junit.Test
@java.lang.SuppressWarnings(value = "all")
public void testGetTestPhaseSyncMap_notParallel() {
    java.util.concurrent.ConcurrentMap<com.hazelcast.simulator.test.TestPhase, java.util.concurrent.CountDownLatch> testPhaseSyncMap = com.hazelcast.simulator.test.TestPhase.getTestPhaseSyncMap(false, 5, TestPhase.RUN);
    org.junit.Assert.assertNull(testPhaseSyncMap);
}