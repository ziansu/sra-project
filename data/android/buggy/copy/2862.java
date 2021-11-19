private boolean testingThisTest(org.junit.runner.Description description) {
    return description.getTestClass().equals(testClass);
}