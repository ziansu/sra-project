public void onClick(android.content.DialogInterface dialog, int id) {
    Auth.GoogleSignInApi.signOut(mGoogleClient);
    com.example.jeobmallari.ilib.Home.super.onBackPressed();
}