@java.lang.Override
public void onClick(android.view.View view) {
    mChatBox.setText("");
    mChatPresenter.sendClicked();
}