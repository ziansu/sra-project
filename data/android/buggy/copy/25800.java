@java.lang.Override
public void create(android.app.Activity activity, android.os.Bundle savedInstanceState) {
    loadNavList();
    if ((mCategory) != null) {
        selectItem(mCategory, false);
    }
    mView.onLockDragLayout(needLockDrawerLayout());
}