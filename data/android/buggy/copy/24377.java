@java.lang.Override
public void onStart() {
    super.onStart();
    animation.start();
    start = java.lang.System.currentTimeMillis();
    shouldUpdate = true;
    handler.postDelayed(updater, 34);
}