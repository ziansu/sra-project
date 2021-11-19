public void setTitle(java.lang.CharSequence title, java.lang.CharSequence subtitle, org.kontalk.data.Contact contact) {
    android.support.v7.app.ActionBar bar = getSupportActionBar();
    if (title != null)
        bar.setTitle(title);
    
    if (subtitle != null)
        bar.setSubtitle(subtitle);
    
}