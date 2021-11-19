public android.view.MenuItem setVisible(boolean visible) {
    mFlags = ((mFlags) & (com.cocosw.bottomsheet.ActionMenuItem.HIDDEN)) | (visible ? 0 : com.cocosw.bottomsheet.ActionMenuItem.HIDDEN);
    return this;
}