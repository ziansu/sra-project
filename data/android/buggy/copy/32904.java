private void showView() {
    if ((comeFrom) == 2) {
        usn_et.setText(sdk.account.getUsn());
        psd_et.setText(sdk.account.getPsd());
    }
}