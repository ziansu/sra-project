@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mapFragment.removeOnTouchListeners();
}