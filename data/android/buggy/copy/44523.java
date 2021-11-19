public static fi.letsdev.yourhealth.repository.PatientRepository getInstance(fi.letsdev.yourhealth.interfaces.InterfacePatientRepository listener) {
    if ((fi.letsdev.yourhealth.repository.PatientRepository.instance) == null) {
        fi.letsdev.yourhealth.repository.PatientRepository.instance = new fi.letsdev.yourhealth.repository.PatientRepository(listener);
    }
    return fi.letsdev.yourhealth.repository.PatientRepository.instance;
}