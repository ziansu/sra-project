@java.lang.Override
public void onUserClick(android.view.View view, long userDbId) {
    fr.sims.coachingproject.ui.activity.ProfileActivity.startActivity(getActivity(), userDbId);
}