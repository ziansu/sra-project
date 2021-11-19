@java.lang.Override
protected void onStart() {
    mPlayPresenter.connectGoogleApiClient();
    mPlayPresenter.calculateAndSetScore();
    super.onStart();
}