@java.lang.Override
public void onClick(android.view.View view) {
    int viewId = view.getId();
    if (viewId == (CLOSE_LINK_ID)) {
        closeWindow();
        return ;
    }
    if (viewId == (LICENSE_LINK_ID)) {
        showLicenseText();
        return ;
    }
}