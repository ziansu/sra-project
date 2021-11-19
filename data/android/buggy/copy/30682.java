@java.lang.Override
public void recommendedRegionItemNotFound(java.lang.String contentType) {
    if ((contentType.equals(ContentManagerImpl.GRAPHHOPPER_MAP)) && (isContentNotificationsEnabled)) {
        showContentDialog();
    }
}