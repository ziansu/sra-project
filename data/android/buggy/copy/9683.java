@org.junit.Test
public void normalPropertiesDecrypted() {
    org.junit.Assert.assertEquals("foo", environment.resolvePlaceholders("${foo}"));
}