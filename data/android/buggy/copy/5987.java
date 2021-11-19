@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    java.lang.System.out.println(("dataSnapshot: " + (dataSnapshot.getValue())));
    com.togather.user.UserService.updateQuestions(((java.util.List<java.lang.String>) (dataSnapshot.getValue())));
}