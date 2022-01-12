@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    org.dreamitcodeit.storyteller.MapActivityPermissionsDispatcher.onRequestPermissionsResult(this, requestCode, grantResults);
    locFlag = true;
}