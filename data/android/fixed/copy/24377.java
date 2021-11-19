@java.lang.Override
public void onStart() {
    super.onStart();
    animation.start();
    shouldUpdate = true;
    handler.postDelayed(updater, 34);
}