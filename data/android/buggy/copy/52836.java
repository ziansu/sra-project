@java.lang.Override
protected void onResume() {
    super.onResume();
    openGL.onResume();
    java.lang.System.gc();
}