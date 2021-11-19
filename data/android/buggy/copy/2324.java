@java.lang.Override
protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
    popMenu = true;
    peter.util.searcher.view.SearchWebView.ContextMenuInfo info = new peter.util.searcher.view.SearchWebView.ContextMenuInfo(getHitTestResult(), touchX, touchY);
    info.setSearchWebView(this);
    return info;
}