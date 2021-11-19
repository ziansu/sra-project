@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.matchagames.setmania.activities.MenuActivity.class);
    startActivity(intent);
    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    finish();
}