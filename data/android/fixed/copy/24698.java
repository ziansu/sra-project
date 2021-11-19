@java.lang.Override
public void onClick(android.view.View v) {
    if ((innerListener) != null) {
        innerListener.onRowClick(position);
    }
}