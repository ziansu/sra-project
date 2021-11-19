private void openSCMApp() {
    com.cloudogu.ces.EcoSystem.openApp("scm");
    org.junit.Assert.assertThat(Driver.webDriver.getTitle(), org.hamcrest.Matchers.startsWith("CAS"));
}