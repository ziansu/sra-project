@java.lang.Override
public void onFailure(java.lang.Throwable throwable) {
    retFuture.setException(throwable);
    retFuture.set(null);
}