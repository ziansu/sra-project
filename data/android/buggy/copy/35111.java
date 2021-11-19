public static void setIntResultCallback(com.paul.okhttpframework.okhttp.callback.IResultCallback iResultCallback, int tag) {
    com.paul.okhttpframework.okhttp.manager.OkBD.mCallbackHashMap.put(tag, iResultCallback);
}