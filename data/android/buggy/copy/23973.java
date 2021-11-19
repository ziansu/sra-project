@java.lang.Override
protected void onPause() {
    super.onPause();
    paused = true;
    handleMethods("pause");
    pause();
}