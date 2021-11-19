private void processError(int errorCode, java.lang.Exception e) {
    mOnErrorListener.onError(errorCode, e);
    releaseResources();
    setState(ee.ioc.phon.android.speak.RecognizerIntentService.State.ERROR);
}