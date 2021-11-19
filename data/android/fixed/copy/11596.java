protected static void resetContextEnvironment() {
    org.apache.flink.api.java.ExecutionEnvironment.contextEnvironmentFactory.set(null);
}