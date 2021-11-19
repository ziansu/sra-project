@org.junit.Test
public void recordLong() throws java.lang.Exception {
    long l = 1000L;
    assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("l"), org.hamcrest.CoreMatchers.equalTo(java.lang.Long.toString(l)));
}