public void regNoCheckDone(android.os.Bundle data) {
    com.extenprise.mapp.medico.util.Utility.showProgressDialog(this, false);
    if (data.getBoolean("exists")) {
        mRegNo.setError("This Registration Number is already Registered.");
        mRegNo.requestFocus();
    }
}