@java.lang.Override
public void run() {
    if (null != callback) {
        callback.onSuccess(getGlobalBlacklistUnverifiedDevices());
    }
}