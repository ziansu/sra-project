@java.lang.Override
public void onClick(android.view.View v) {
    manager.removeView(view);
    view = null;
    android.util.Log.d("Checking View", ((view) == null ? "View is null" : "View is not null"));
}