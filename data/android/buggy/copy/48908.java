@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.getValue()) == null) {
        java.lang.String workIsDone = "Your work is done here. All users have been assigned to at least one group.";
        updateLabel(view, R.id.txt_explanation, workIsDone);
    }else {
        doit(ref);
    }
}