@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    vn.coderschool.speakup.model.User currentUser = ((vn.coderschool.speakup.model.User) (dataSnapshot.getValue(vn.coderschool.speakup.model.User.class)));
    if ((currentUser.profilePhotoUrl) != null) {
        levelTestView.showUserAvatar(currentUser.profilePhotoUrl.toString());
    }
}