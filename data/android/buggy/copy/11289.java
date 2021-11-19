@java.lang.Override
public void onClick(android.view.View view) {
    friend.sendingStarted = true;
    sendImageListener.onImageUploadStarted(friend);
    notifyDataSetChanged();
}