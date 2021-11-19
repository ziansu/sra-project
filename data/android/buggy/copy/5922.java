@org.junit.Test
public void test_getOutputResultAsString_AfterRunningWithEmptyFilter_NoNullValue() throws java.lang.InterruptedException {
    org.hlib4j.process.ProcessScanner process_scanner = new org.hlib4j.process.ProcessScanner(this.processBuilder, "");
    process_scanner.run();
    process_scanner.join();
    org.junit.Assert.assertNotNull(process_scanner.getOutputResultAsString());
}