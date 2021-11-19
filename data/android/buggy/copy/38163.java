@java.lang.Override
public void onClick(android.view.View v) {
    if (existAccount())
        startActivity(new android.content.Intent(this, it.eternitywall.eternitywall.activity.DebugActivity.class));
    else
        dialogCreateAccount();
    
}