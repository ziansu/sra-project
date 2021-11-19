@java.lang.Override
public void onResume() {
    super.onResume();
    handler.postDelayed(runInt50, 20);
}