public void onEvent(java.lang.String basicEvent) {
    if (basicEvent.equals(LoginCallback.LOGIN_SUCCESS)) {
        progressDialog.dismiss();
        android.content.Intent intent = new android.content.Intent(this, com.randomappsinc.blanknavigationdrawer.Activities.MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}