@com.pilloxa.backgroundjob.ReactMethod
public void getAll(com.pilloxa.backgroundjob.Callback callback) {
    com.pilloxa.backgroundjob.WritableArray jobs = _getAll();
    callback.invoke(jobs);
}