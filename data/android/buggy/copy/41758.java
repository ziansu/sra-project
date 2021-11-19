public org.openmrs.Patient convert(org.openmrs.module.registrationcore.api.mpi.openempi.OpenEmpiPatientQuery patientQuery) {
    org.openmrs.module.registrationcore.api.mpi.common.MpiPatient patient = new org.openmrs.module.registrationcore.api.mpi.common.MpiPatient();
    patient = ((org.openmrs.module.registrationcore.api.mpi.common.MpiPatient) (convertPatient(patient, patientQuery)));
    patient.setMpiPatient(true);
    return patient;
}