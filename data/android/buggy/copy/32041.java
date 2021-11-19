@java.lang.Override
public org.openmrs.module.muzimabiometrics.MuzimaFingerprint findByPatientUUID(java.lang.String patientUUID) {
    java.lang.System.out.println(("findbyPatientUUid ++++++++++++++++++++++++++++++++++++++" + patientUUID));
    return ((org.openmrs.module.muzimabiometrics.MuzimaFingerprint) (session().createQuery((("from MuzimaFingerprint m where m.patientUUID = '" + patientUUID) + "'")).uniqueResult()));
}