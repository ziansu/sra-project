@java.lang.Override
public void onClick(android.view.View view) {
    android.support.design.widget.Snackbar.make(view, "Show history", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    expandTile(view);
}