@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    view.stopGame();
    view.releaseResources();
}