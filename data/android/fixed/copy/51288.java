private void resetStatistics() {
    Main.forwardedMessageCounts = new long[250];
    Main.queryExecutionSummary = new long[250][2];
    java.lang.System.out.println("Reseted statistics successfully");
}