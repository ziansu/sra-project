private int getHeaderHeightForLayout(android.view.View header) {
    if (header != null) {
        return header.getMeasuredHeight();
    }
    return 0;
}