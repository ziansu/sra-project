@java.lang.Override
public void onResult(java.util.Set<io.datakernel.hashfs.Replica> result) {
    onShowAliveResponse(eventloop.currentTimeMillis(), result);
    updateServersMap(eventloop, address);
}