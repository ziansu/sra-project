public void run() {
    try {
        com.mde.potdroid.helpers.Utils.log(response.body().string());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    callback.onSuccess();
}