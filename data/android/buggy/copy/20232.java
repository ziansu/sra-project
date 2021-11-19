@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    if (savedInstanceState != null) {
        currentUser.setVolID(savedInstanceState.getLong(com.mattbozelka.cleanupstars.LoginFragment.USERID));
    }
    super.onActivityCreated(savedInstanceState);
}