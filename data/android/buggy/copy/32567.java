public void getExtras() {
    stopWatchDogTimer();
    mPhoneId = getIntent().getExtras().getString(Constants.Extras.PHONE_ID, null);
}