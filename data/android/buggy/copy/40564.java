public void registerTimerCallback(com.fivetrue.workout.timer.service.IRTimerCallback callback) {
    if (callback != null) {
        try {
            com.fivetrue.workout.timer.service.RTimerHelper.sTimerService.registerTimerCallback(callback);
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
        }
    }
}