@java.lang.Override
public int getSpanSize(int position) {
    if (mAdapter.isContentView(position)) {
        return 1;
    }else {
        return layoutManager.getSpanCount();
    }
}