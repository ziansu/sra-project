public void deleteUser(com.example.catherinemorris.shoppinwithfriends.User user) {
    android.util.Log.d("User deleteUser is called", ("" + user));
    db.deleteFriend(this, user.getUser());
}