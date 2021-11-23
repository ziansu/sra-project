@java.lang.Override
public void filter(java.lang.CharSequence s) {
    if (((mAdapter) != null) && ((mAdapter.getFilter()) != null)) {
        mAdapter.getFilter().filter(s);
    }
}