public void setWarnMessage(java.lang.String warnMessage, java.util.List<org.eclipse.swt.custom.StyleRange> warnStyleRange) {
    this.warnMessage = warnMessage;
    this.warnStyleRange = warnStyleRange;
    loginDialog.setErrorMessage(warnMessage, warnStyleRange);
}