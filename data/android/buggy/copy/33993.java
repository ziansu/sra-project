@java.lang.Override
public void onTabReSelected(@android.support.annotation.IdRes
int tabId) {
    if (tabId != (com.example.user.kchat01.ContactsActivity.tabId)) {
        android.content.Intent contactsIntent = new android.content.Intent(getApplicationContext(), com.example.user.kchat01.ContactsActivity.class);
        startActivity(contactsIntent);
    }
}