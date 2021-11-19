@org.junit.Test
public void recordDouble() throws java.lang.Exception {
    double d = 5.5;
    assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("d"), org.hamcrest.CoreMatchers.equalTo(java.lang.Double.toString(d)));
}