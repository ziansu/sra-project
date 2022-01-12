@java.lang.Override
public void onClick(android.view.View view) {
    sendMessageWithPayload(mMessageEditText.getText().toString(), FriendlyMessage.MessageType.Text, false, false);
    mMessageEditText.setText("");
}