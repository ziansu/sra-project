@java.lang.Override
public void run() {
    setupMenuItems(false);
    ((android.widget.BaseAdapter) (mDrawerList.getAdapter())).notifyDataSetChanged();
}