public final void queryFirstPage() {
    if (mPagedInfo.tryToEnterLock()) {
        mPagedInfo.moveToFirstPage();
        doQueryData(mPagedInfo.getCurrentPage());
    }
}