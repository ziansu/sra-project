@java.lang.Override
public void onBackPressed() {
    android.widget.Button userButton = ((android.widget.Button) (findViewById(R.id.userButton)));
    if (userButton != null)
        userButton.performClick();
    
    return ;
}