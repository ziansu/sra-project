@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.String... strings) {
    java.lang.String str = chatText.getText().toString();
    return provider.sendMessage(receiver, chatText.getText().toString());
}