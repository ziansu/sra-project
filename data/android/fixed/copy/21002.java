@java.lang.Override
public void onSuccess() {
    if (callback != null) {
        callback.onSuccess();
    }
    consumeNextSendSignal();
}