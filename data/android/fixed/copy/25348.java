public final void queryFirstPage() {
    mPagedInfo.moveToFirstPage();
    doQueryData(mPagedInfo.getCurrentPage());
}