@java.lang.Override
public void onClick(android.view.View v) {
    if ((mItem) != null) {
        mItem.set(mItem.getOriginal());
        setViews(rootView, mItem);
    }
}