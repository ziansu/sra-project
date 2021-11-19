@java.lang.Override
protected void onSaveInstanceState(final android.os.Bundle outState) {
    outState.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
    super.onSaveInstanceState(outState);
    outState.putBoolean(com.egonzalez.simpleredditclient.view.MainActivity.SAVEDINSTANCESTATE_REQUESTDATA, mMustRequestData);
}