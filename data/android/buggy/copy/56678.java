public void on_click_logout(android.view.View view) {
    myDB.close();
    startActivity(new android.content.Intent(this, info.androidhive.materialtabs.activity.Login_Activity.class));
}