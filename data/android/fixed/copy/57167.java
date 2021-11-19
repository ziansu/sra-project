@java.lang.Override
public void onUnreadConversationsCountChanged(final long count) {
    mMessagesButton.setUnreadCount(((int) (mLayerHelper.getUnreadConversationsCount())));
}