public sumimakito.android.quickkv.database.QKVCallback cbkFailed(java.lang.String msg) {
    return this.isCallbackEnabled ? new sumimakito.android.quickkv.database.QKVCallback(false, QKVCallback.CODE_FAILED, msg) : null;
}