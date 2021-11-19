private void showDetectionOptions(com.vasomedical.spinetracer.model.PatientModel patient) {
    com.vasomedical.spinetracer.fragment.detect.DetectionOptionsFragment fragment = new com.vasomedical.spinetracer.fragment.detect.DetectionOptionsFragment();
    fragment.setPatient(patient);
    fragmentUtil.showFragment(new com.vasomedical.spinetracer.fragment.detect.DetectionOptionsFragment());
}