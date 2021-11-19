@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    if (dataSnapshot.getValue().toString().equals("false")) {
        legitWin = true;
        second = 0;
        timerFrame.removeAll();
    }
}