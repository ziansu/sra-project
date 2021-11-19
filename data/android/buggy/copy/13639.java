@java.lang.Override
public void onClick(android.view.View v) {
    com.example.s3529589.mad_a1.Model.AddFriendActivity a = new com.example.s3529589.mad_a1.Model.AddFriendActivity();
    android.content.Intent contactPickerIntent = new android.content.Intent(android.content.Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
    mActivity.startActivityForResult(contactPickerIntent, com.example.s3529589.mad_a1.Controller.AddFriendController.PICK_CONTACTS);
}