@java.lang.Override
public void onClick(android.view.View v) {
    mNotRegisteredText.setTextColor(getResources().getColor(R.color.colorAccent));
    android.content.Intent registerIntent = new android.content.Intent(this, koala.com.koalaapp.RegisterActivity.class);
    registerIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(registerIntent);
}