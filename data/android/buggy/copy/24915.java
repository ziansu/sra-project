public void changeOpenmrsIdName(org.openmrs.api.PatientService patientService) {
    org.openmrs.PatientIdentifierType openmrsIdType = patientService.getPatientIdentifierTypeByName("OpenMRS ID");
    openmrsIdType.setName("iSantePlus ID");
    patientService.savePatientIdentifierType(openmrsIdType);
}