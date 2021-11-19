private void serviceStarted() {
    de.greenrobot.event.EventBus.getDefault().post(new com.task.vasskob.firebase.event.ServiceIsRunningEvent(true));
    startNotification();
}