@java.lang.Override
public void onContactEntrySaveChanges(edu.pdx.ece558_fall15.alex_elizabeth.businesscardcontact.ContactEntry ce) {
    android.util.Log.d(edu.pdx.ece558_fall15.alex_elizabeth.businesscardcontact.ContactEditDetailActivity.TAG, "onContactEntrySaveChanges");
    mContactEntry = ce;
    finishActivity(true);
}