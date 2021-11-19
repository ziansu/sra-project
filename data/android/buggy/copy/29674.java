private com.android.internal.telephony.uicc.IccRecords getUiccRecords(int appFamily) {
    return mUiccController.getIccRecords(mPhone.getPhoneId(), appFamily);
}