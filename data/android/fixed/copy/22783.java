private void negativeTest(java.lang.String[] list) {
    for (java.lang.String input : list) {
        try {
            com.springer.challenge.commands.Command.create(input);
            org.junit.Assert.fail(input);
        } catch (com.springer.challenge.commands.InvalidParameterException e) {
        }
    }
}