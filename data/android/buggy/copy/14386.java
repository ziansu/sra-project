@java.lang.Override
protected void initListView(android.database.Cursor messagesCursor) {
    messagesAdapter = new com.quickblox.q_municate.ui.chats.GroupDialogMessagesAdapter(this, messagesCursor, this, dialog);
    messagesListView.setAdapter(((se.emilsjolander.stickylistheaders.StickyListHeadersAdapter) (messagesAdapter)));
    isNeedToScrollMessages = true;
    scrollListView();
}