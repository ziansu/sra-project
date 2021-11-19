@java.lang.Override
public void binderDied() {
    binder.unlinkToDeath(this, 0);
    com.lody.virtual.helper.utils.VLog.e(com.lody.virtual.client.ipc.ServiceManagerNative.TAG, "Ops, the server has crashed.");
    com.lody.virtual.client.env.VirtualRuntime.exit();
}