@org.junit.Test
public void recordShort() throws java.lang.Exception {
    short s = 500;
    assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("s"), org.hamcrest.CoreMatchers.equalTo(java.lang.Short.toString(s)));
}