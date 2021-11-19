@java.lang.Override
public void handleMessage(android.os.Message msg) {
    int w = fixedWidth;
    int h = fixedHeight;
    android.os.Bundle bundle = msg.getData();
    pictureData = bundle.getByteArray("pictureData");
    sendData();
}