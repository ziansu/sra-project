@java.lang.Override
public void onRefresh() {
    chatWithList = new java.util.ArrayList<com.byteshaft.medicosperuanos.messages.ChatModel>();
    adapter = new com.byteshaft.medicosperuanos.messages.MainMessages.Adapter(getActivity().getApplicationContext(), chatWithList);
    mMessagesListView.setAdapter(adapter);
    swipeRefresh = true;
    getMessages();
}