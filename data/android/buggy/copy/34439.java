public void setPartner(@android.support.annotation.NonNull
java.lang.String currentText, java.lang.String cursortext, long newID) {
    if (!(android.text.TextUtils.isEmpty(currentText))) {
        setPartnername(currentText);
        setPartnerID(newID);
    }
}