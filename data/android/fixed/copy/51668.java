@java.lang.Override
public void onChildChanged(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    android.util.Log.d(com.pajato.android.gamechat.database.handler.MessagesChangeHandler.TAG, java.lang.String.format(java.util.Locale.US, com.pajato.android.gamechat.database.handler.MessagesChangeHandler.LOG_FORMAT, "onChildChanged", dataSnapshot, s));
    process(dataSnapshot, com.pajato.android.gamechat.event.MessageChangeEvent.CHANGED);
}