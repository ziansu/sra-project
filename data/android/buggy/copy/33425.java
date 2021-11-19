@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent activity = new android.content.Intent(this, com.example.android.onthespot.MenuActivity.class);
    startActivity(activity);
    finish();
}