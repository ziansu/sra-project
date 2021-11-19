@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mOpenCvCameraView.disableView();
    if ((btSocket) != null) {
        try {
            btSocket.close();
        } catch (java.io.IOException e) {
        }
    }
}