@java.lang.Override
public void onClick(android.view.View v) {
    finish();
    android.content.Intent intent = new android.content.Intent(this, com.mlabs.bbm.iquiz.On_Touch.class);
    startActivity(intent);
}