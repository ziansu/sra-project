private void showConfirmAlertDialog() {
    confirmAlertDialog = makeAlertDialog();
    confirmAlertDialog.setTitle(getString(R.string.confirmNumber));
    confirmAlertDialog.setMessage(getString(R.string.confirmNumberQuestion));
    confirmAlertDialog.create();
}