@java.lang.Override
protected void onStateChange(io.grpc.internal.InternalSubchannel is, io.grpc.ConnectivityStateInfo newState) {
    org.junit.Assert.assertSame(internalSubchannel, is);
    callbackInvokes.add(("onStateChange:" + newState));
}