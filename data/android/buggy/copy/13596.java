@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    android.util.Log.d(com.pajato.android.gamechat.database.handler.MessagesChangeHandler.TAG, java.lang.String.format(java.util.Locale.US, com.pajato.android.gamechat.database.handler.MessagesChangeHandler.LOG_FORMAT, "onChildAdded", dataSnapshot, s));
    process(dataSnapshot, true, com.pajato.android.gamechat.event.MessageChangeEvent.NEW);
}