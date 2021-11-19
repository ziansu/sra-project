private void showFailure(java.lang.String reason, java.lang.String goBackTo) {
    jLabelFailReason.setText(reason);
    changeCard("panelFail", goBackTo);
}