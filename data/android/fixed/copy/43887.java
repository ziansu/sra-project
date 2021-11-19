@java.lang.Override
public void onError(java.lang.Throwable e) {
    callBack.onError(e.getMessage());
    removeSubscription(key);
}