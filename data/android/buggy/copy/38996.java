@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    mZMQRecvTask = new com.fan.gazeshutter.service.ZMQReceiveTask(this);
    mZMQRecvTask.execute(com.fan.gazeshutter.utils.NetworkUtils.getServerIP());
    android.util.Log.d(com.fan.gazeshutter.service.OverlayService.TAG, "onStartCommand");
    return START_STICKY;
}