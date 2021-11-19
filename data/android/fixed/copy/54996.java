public void setPostChats(java.util.List<com.held.retrofit.response.PostChatData> postChatData) {
    timber.log.Timber.d("Inside SetPostChat");
    mPostChatData = postChatData;
    this.notifyDataSetChanged();
}