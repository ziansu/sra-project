public void run() {
    if ((getResponse()) == "login_200_FOUND") {
        onLoginSuccess();
    }else
        if ((getResponse()) == "login_404_NOTFOUND") {
            onLoginFailed();
        }
    
    progressDialog.dismiss();
}