@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    user = dataSnapshot.getValue(com.sportus.sportus.data.User.class);
    com.sportus.sportus.BaseActivity activity = ((com.sportus.sportus.BaseActivity) (getActivity()));
    activity.fillHeaderNavigation(user);
}