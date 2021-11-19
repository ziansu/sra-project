@org.junit.AfterClass
public static void cleanup() {
    java.lang.System.clearProperty("SCS_KAFKA_TEST_EMBEDDED");
}