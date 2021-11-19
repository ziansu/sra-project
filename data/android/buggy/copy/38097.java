public void checkFriendisUser(com.example.temp2015.sign_in_and_ui.User friend) {
    com.example.temp2015.sign_in_and_ui.FirebaseConnection.PinValueEventListener pinListener = new com.example.temp2015.sign_in_and_ui.FirebaseConnection.PinValueEventListener(com.example.temp2015.sign_in_and_ui.FirebaseConnection.pushRef.child("Pins"), friend);
    com.example.temp2015.sign_in_and_ui.FirebaseConnection.rootRef.addListenerForSingleValueEvent(pinListener);
}