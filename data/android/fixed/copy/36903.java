@java.lang.Override
protected void onResume() {
    super.onResume();
    if (!(context.IsUserLoggedOut())) {
        goToHome();
    }
}