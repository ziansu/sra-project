@java.lang.Override
public void onMessage(javax.jms.Message message) {
    org.openmrs.api.context.Context.openSession();
    if (coreProperties.isMpiEnabled()) {
        org.openmrs.Patient patient = extractPatient(message);
        performMpiAction(patient);
    }
    org.openmrs.api.context.Context.closeSession();
}