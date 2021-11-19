@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(mContext, "Clicked button Edit", Toast.LENGTH_SHORT).show();
    asiantech.vn.main.MainActivity.showFragmentEditContact(new asiantech.vn.listcontact.ListContactClass(position, mListContacts));
}