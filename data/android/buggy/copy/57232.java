public final <T> hcmue.gst.off.extensions.Result<T> Fail(java.lang.String message, T data) {
    return new hcmue.gst.off.extensions.Result<T>(data, message, false);
}