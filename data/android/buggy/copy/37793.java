public void onClick(android.view.View v) {
    setNotificationData();
    switch (v.getId()) {
        case R.id.btnMainSendNotificationActionBtn :
            setDataForNotificationWithActionButton();
            break;
    }
    firebaseAuth = com.google.firebase.auth.FirebaseAuth.getInstance();
}