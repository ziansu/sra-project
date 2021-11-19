@java.lang.Override
protected void onPostExecute(java.lang.String msg) {
    messageEditText.setText("");
    sendMessageButton.setClickable(true);
    messageEditText.requestFocus();
    populateMessages();
}