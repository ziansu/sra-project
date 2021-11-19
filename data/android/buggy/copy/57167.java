@java.lang.Override
public void onUnreadConversationsCountChanged(final long count) {
    if ((mMessagesButton) != null) {
        mMessagesButton.setUnreadCount(((int) (mLayerHelper.getUnreadConversationsCount())));
    }
}