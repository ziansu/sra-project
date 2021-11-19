@org.junit.Before
@java.lang.Override
public void setup() throws java.lang.Exception {
    super.setup();
    org.openmrs.Patient p = createPatient("X3XK71");
    createRegistrationEncounter(p);
}