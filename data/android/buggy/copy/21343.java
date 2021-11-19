private int getHeaderHeightForLayout(android.view.View header) {
    if (header != null) {
        return mRenderHeaderInline ? 0 : header.getMeasuredHeight();
    }
    return 0;
}