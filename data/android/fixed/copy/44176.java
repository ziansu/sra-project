public void btnExitClicked(android.view.View button) {
    android.content.Intent intent = new android.content.Intent(this, com.app.carnelao.presentation.ui.login.LoginActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(intent);
    finish();
}