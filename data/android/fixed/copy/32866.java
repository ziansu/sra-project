@java.lang.Override
public int bindService(android.os.IBinder caller, android.os.IBinder token, android.content.Intent service, java.lang.String resolvedType, android.app.IServiceConnection connection, int flags) {
    return bindServiceAsUser(caller, token, service, connection, flags, com.lody.virtual.os.VUserHandle.getCallingUserId());
}