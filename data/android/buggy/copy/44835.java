@java.lang.Override
protected void onStop() {
    core.util.Utils.nullViewDrawablesRecursive(findViewById(android.R.id.content).getRootView());
    core.util.Utils.unbindDrawables(findViewById(android.R.id.content).getRootView());
    super.onStop();
}