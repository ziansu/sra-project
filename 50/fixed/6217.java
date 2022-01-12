@org.junit.Test
public void getAliases() {
    org.junit.Assert.assertThat(net.time4j.tz.threeten.JdkZoneProviderTest.zp.getAliases().isEmpty(), org.hamcrest.CoreMatchers.is(true));
}