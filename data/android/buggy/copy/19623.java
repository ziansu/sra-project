@org.junit.Test
public void shouldReturnZeroIfNoUri() {
    junit.framework.Assert.assertEquals(0, throughputReport.get());
}