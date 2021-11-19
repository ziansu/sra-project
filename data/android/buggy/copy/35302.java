public void setEnablePush(int enablePush) throws java.io.IOException {
    if (enablePush > 1) {
        throw new org.apache.coyote.http2.Http2Exception(sm.getString("connectionSettings.enablePushInvalid", java.lang.Long.toString(enablePush)), 0, Http2Exception.PROTOCOL_ERROR);
    }
    this.enablePush = enablePush;
}