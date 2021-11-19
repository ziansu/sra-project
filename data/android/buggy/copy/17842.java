@java.lang.Override
public void onResumeFragment() {
    if ((user) != null) {
        android.util.Log.d("Test", "UserRatingsFragment.onResumeFragment()");
        ratingService.loadUserRatings(this, user.getUserId());
    }
}