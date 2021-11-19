public void verifyStopped(double minimumPower) {
    org.junit.Assert.assertTrue(((java.lang.Math.abs(getLeftSetpoint())) < minimumPower));
    org.junit.Assert.assertTrue(((java.lang.Math.abs(getRightSetpoint())) < minimumPower));
}