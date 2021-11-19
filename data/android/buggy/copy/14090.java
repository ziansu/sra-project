public void onClick(android.content.DialogInterface dialog, int which) {
    com.ufone.uess.UserAuthentication.unauthenticate();
    finish();
    android.content.Intent intent = new android.content.Intent(this, com.ufone.uess.LoginActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(intent);
}