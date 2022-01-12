@java.lang.Override
public void handleResult(com.google.zxing.Result rawResult) {
    saveResult(rawResult.getText());
}