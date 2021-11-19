private void reformData() {
    android.os.Bundle bundle = getArguments();
    if (bundle != null) {
        specialitySelected = bundle.getBooleanArray(PatientViewActivity.PATIENT);
    }else {
        specialitySelected = null;
    }
}