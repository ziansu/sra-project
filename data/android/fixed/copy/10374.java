@java.lang.Override
public void onSuccess(@android.support.annotation.NonNull
es.uv.uvlive.data.gateway.response.MessageListResponse messageListResponse) {
    onMessagesReceived(messageListResponse);
    if ((messageListResponse.getMessages().size()) == 0) {
        endList = true;
    }
}