public void onLogout() {
    com.parse.ParseUser.logOut();
    android.util.Log.d("TAG", "on log out");
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.tiferet.rebook.LoginActivity.class);
    startActivity(intent);
    finish();
}