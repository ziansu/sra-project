public void verifyNotTurning(double minimumDifference) {
    org.junit.Assert.assertEquals(getLeftSetpoint(), getRightSetpoint(), minimumDifference);
}