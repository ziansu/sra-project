public void addMessage(com.taylorstubbs.whodischat.models.Message message) {
    android.util.Log.d(com.taylorstubbs.whodischat.adapters.MessageAdapter.TAG, "adding message");
    mMessages.add(message);
    notifyDataSetChanged();
}