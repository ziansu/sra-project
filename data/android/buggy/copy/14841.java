@java.lang.Override
public void notifyDataSetChanged() {
    if (!((mBaseAdapter) instanceof android.widget.ArrayAdapter<?>))
        mBaseAdapter.notifyDataSetChanged();
    
}