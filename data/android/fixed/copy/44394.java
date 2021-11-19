public void callBackFailed(com.mogujie.lever.calendarlever.core.ICallBack callback) {
    if (callback != null) {
        callback.onFailed();
    }
}