@org.junit.Test
public void onBackActivityShouldReturnChildImmunizationActivityClass() {
    junit.framework.Assert.assertNotNull(activity.getVaccinatorApplicationInstance());
    junit.framework.Assert.assertTrue(((activity.onBackActivity()) == (org.smartregister.path.activity.ChildImmunizationActivity.class)));
}