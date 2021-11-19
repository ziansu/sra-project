private void processError(int errorCode, java.lang.Exception e) {
    setState(ee.ioc.phon.android.speak.RecognizerIntentService.State.ERROR);
    mOnErrorListener.onError(errorCode, e);
    releaseResources();
    stopSelf();
}