public void testRunFinished(org.junit.runner.Result result) {
    java.lang.System.out.println(("Number of test cases executed: " + (result.getRunCount())));
    agent.setSessionId("end");
}