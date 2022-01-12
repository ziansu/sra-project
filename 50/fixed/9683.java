@org.junit.Test
public void normalPropertiesDecrypted() {
    org.junit.Assert.assertEquals("foo", this.environment.resolvePlaceholders("${foo}"));
}