@java.lang.Override
public void onReceiveValue(java.lang.Boolean value) {
    if (callback != null) {
        if (value) {
            callback.invoke("succes");
        }else {
            callback.invoke("failed");
        }
    }
}