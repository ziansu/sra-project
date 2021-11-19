@java.lang.Override
public void onFail(int failCode) {
    completionHandler.onComplete();
}