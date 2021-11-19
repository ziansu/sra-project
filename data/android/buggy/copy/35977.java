@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode mode) {
    android.widget.Toast.makeText(mContext, "this", Toast.LENGTH_SHORT).show();
    thumbnail.setColorFilter(android.graphics.Color.argb(0, 0, 0, 0));
}