@org.junit.Before
public void setUp() throws java.lang.Exception {
    org.junit.Assume.assumeThat(getEnvironment(), org.hamcrest.core.AnyOf.anyOf(org.hamcrest.core.IsEqual.equalTo(ENV.CI), org.hamcrest.core.IsEqual.equalTo(ENV.RELEASE)));
    super.setUp();
}