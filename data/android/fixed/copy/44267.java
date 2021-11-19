private void restartTheme() {
    android.content.Intent intent = this.getIntent();
    finish();
    startActivity(intent);
    overridePendingTransition(R.anim.fade_in_real, R.anim.fading_out_real);
}