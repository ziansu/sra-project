@java.lang.Override
public int getUnreadCount(final com.vaguehope.onosendai.config.Column column, final boolean excludeRetweets) {
    return getUpCount(com.vaguehope.onosendai.storage.DbAdapter.UpCountType.UNREAD, column, Selection.FILTERED, excludeRetweets);
}