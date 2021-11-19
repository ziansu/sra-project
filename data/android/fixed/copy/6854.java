@java.lang.Override
protected void onResume() {
    new com.example.oauthtwitterdemo.activity.AuthorizationActivity.GetOAuthURL4TwitterAsyncTask().execute();
    super.onResume();
}