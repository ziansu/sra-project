@java.lang.Override
public void onClick(android.view.View v) {
    if ((itemClickListener) != null) {
        itemClickListener.onItemClick(adapter.getItem(position), view, position);
    }
}