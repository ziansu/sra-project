@java.lang.Override
protected void onResume() {
    super.onResume();
    new com.example.oauthtwitterdemo.activity.AuthorizationActivity.GetOAuthURL4TwitterAsyncTask().execute();
}