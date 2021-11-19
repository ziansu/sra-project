private void startChatThreadActivity(int position) {
    com.firebasechatdemo.ui.model.UserListModel item = chatListAdapter.getItem(position);
    startChatThreadActivity(item.userID, item.title, item.image, false, null);
}