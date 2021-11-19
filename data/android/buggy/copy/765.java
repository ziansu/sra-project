@java.lang.Override
protected void onPreExecute() {
    requestArgs = getRequestArgs();
    if (closedSwitch.isChecked()) {
        requestArgs.clear();
        requestArgs.put("visible", false);
    }
    showProgress();
}