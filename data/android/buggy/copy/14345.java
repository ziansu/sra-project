@org.junit.Test(timeout = com.hazelcast.simulator.worker.tasks.AbstractAsyncWorkerTest.DEFAULT_TEST_TIMEOUT)
public void testRun_onResponse() throws java.lang.Exception {
    java.lang.System.out.println("########## testRun_onResponse()");
    test.operationSelectorBuilder.addDefaultOperation(com.hazelcast.simulator.worker.tasks.AbstractAsyncWorkerTest.Operation.ON_RESPONSE);
    testContainer.invoke(TestPhase.SETUP);
    testContainer.invoke(TestPhase.RUN);
    test.responseLatch.await();
}