@java.lang.Override
public void onClick(android.view.View pView) {
    if ((mCallNumber) != null) {
        android.content.Intent callContact = new android.content.Intent(android.content.Intent.ACTION_DIAL);
        callContact.setData(mCallNumber);
        startActivity(callContact);
    }
}