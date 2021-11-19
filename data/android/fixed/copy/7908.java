private void toggleProgressBar(boolean isShow) {
    if (((progressDialog) != null) && isShow) {
        progressDialog.show();
    }else {
        if ((progressDialog) != null) {
            progressDialog.dismiss();
        }
    }
}