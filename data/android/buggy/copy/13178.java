@java.lang.Override
public void setReadTimeout(long millicSeconds) throws java.io.IOException {
    int ret = nativeSetReadTimeout(_handle, millicSeconds);
    if (ret != 0) {
        throw new java.io.IOException();
    }
}