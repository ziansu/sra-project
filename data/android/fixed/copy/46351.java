@org.junit.Test
public void recordInteger() throws java.lang.Exception {
    int i = 5;
    assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("i"), org.hamcrest.CoreMatchers.equalTo(java.lang.Integer.toString(i)));
}