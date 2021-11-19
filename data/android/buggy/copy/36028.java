@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    vn.coderschool.speakup.model.User currentUser = ((vn.coderschool.speakup.model.User) (dataSnapshot.getValue(vn.coderschool.speakup.model.User.class)));
    java.lang.System.out.println(currentUser.profilePhotoUrl.toString());
    levelTestView.showUserAvatar(currentUser.profilePhotoUrl.toString());
}