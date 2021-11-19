@org.junit.Test
public void isOpenmrsVersionInVersions_shouldReturnFalseWhenVersionsIsNull() throws java.lang.Exception {
    org.junit.Assert.assertFalse(org.openmrs.module.ModuleUtil.isOpenmrsVersionInVersions(((java.lang.String[]) (null))));
}