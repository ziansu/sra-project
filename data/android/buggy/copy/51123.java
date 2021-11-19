private void showMissingPermissionError() {
    PermissionUtils.PermissionDeniedDialog.newInstance(true).show(getFragmentManager(), "dialog");
}