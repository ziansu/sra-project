public void signinOnClick(android.view.View v1) {
    android.content.Intent myIntent = new android.content.Intent(this, com.example.parthdoshi.articleshub.SignupPage.class);
    this.startActivity(myIntent);
    finish();
}