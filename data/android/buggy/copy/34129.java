@java.lang.Override
public void onTextMessage(java.lang.String message) {
    if (!(isVisible())) {
        return ;
    }
    updateConsole(((getString(R.string.server_to_client)) + message), MessageAdapter.Type.RECEIVED);
}