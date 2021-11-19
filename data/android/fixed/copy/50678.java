@java.lang.Override
public void bookmarkModelChanged() {
    if (mModel.doesBookmarkExist(mBookmarkId)) {
        updateViewContent(true);
    }else {
        finish();
    }
}