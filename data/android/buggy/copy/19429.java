@java.lang.Override
public void onClick(android.view.View view) {
    adapter.triggerRowChecked(view);
    restartApp();
}