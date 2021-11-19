@java.lang.Override
public void onSuccess() {
    disconnectAndClose(false, new nl.dobots.bluenet.ble.core.callbacks.IStatusCallback() {
        @java.lang.Override
        public void onSuccess() {
            callback.onSuccess();
        }

        @java.lang.Override
        public void onError(int error) {
            callback.onSuccess();
        }
    });
}