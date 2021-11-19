public void editPatientProf(android.view.View v) {
    setFieldsEnability((!(mEditTextCustomerFName.isEnabled())));
    com.extenprise.mapp.medico.util.Utility.collapse(mContLay, false);
    com.extenprise.mapp.medico.util.Utility.collapse(mAddrLayout, true);
}