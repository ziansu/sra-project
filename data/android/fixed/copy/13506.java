@org.junit.Test
public void recordNull() throws java.lang.Exception {
    @java.lang.SuppressWarnings(value = "unused")
    java.lang.String s = null;
    assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("s"), org.hamcrest.CoreMatchers.equalTo("null"));
}