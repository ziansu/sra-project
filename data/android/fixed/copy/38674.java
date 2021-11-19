@org.junit.Before
public void before() throws java.lang.Exception {
    service = org.openmrs.api.context.Context.getService(org.openmrs.module.patientflags.api.FlagService.class);
}