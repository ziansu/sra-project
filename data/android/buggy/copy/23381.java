@java.lang.Override
public void onClick(android.view.View v) {
    int i = v.getId();
    if (i == (R.id.button_facebook_signout)) {
        signOut();
    }
}