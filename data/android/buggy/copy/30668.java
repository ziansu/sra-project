@java.lang.Override
public void onClick(android.view.View v) {
    if (establishConnection()) {
        toast(R.string.successful_connection);
        mMessageView.setText(connection.getReply());
        writeHistory();
    }else {
        toast(R.string.failed_connection);
    }
}