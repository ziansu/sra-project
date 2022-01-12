@java.lang.Override
public android.os.IInterface createInterface() {
    android.os.IBinder binder = ServiceManager.getService.call(Context.MEDIA_ROUTER_SERVICE);
    if ((IMediaRouterService.Stub.asInterface) != null) {
        return IMediaRouterService.Stub.asInterface.call(binder);
    }
    return null;
}