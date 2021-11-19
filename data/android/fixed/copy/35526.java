@java.lang.Override
public void onResult(com.mobvoi.android.wearable.MessageApi.SendMessageResult result) {
    if (result.getStatus().isSuccess()) {
        com.mobvoi.android.test.Utils.setText(this, "send", fh);
    }
}