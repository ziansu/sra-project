@java.lang.Override
public void onException(java.lang.Exception e) {
    if (e instanceof com.shephertz.app42.paas.sdk.android.App42BadParameterException) {
        final com.shephertz.app42.paas.sdk.android.App42BadParameterException bpe = ((com.shephertz.app42.paas.sdk.android.App42BadParameterException) (e));
    }else {
        initFailed(listener, e.getMessage());
    }
}