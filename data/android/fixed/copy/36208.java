@org.junit.Test
public void bootstrapPropertiesExist() {
    org.junit.Assert.assertTrue(this.environment.getPropertySources().contains("bootstrap"));
}