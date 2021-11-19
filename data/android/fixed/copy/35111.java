public static void setIntResultCallback(int tag, com.paul.okhttpframework.okhttp.callback.IResultCallback iResultCallback) {
    com.paul.okhttpframework.okhttp.manager.OkBD.mCallbackHashMap.put(tag, iResultCallback);
}