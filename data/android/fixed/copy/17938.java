public void removeLogoutListener(com.hongyu.reward.interfaces.LogoutListener logoutListener) {
    if ((mLogoutListeners) != null) {
        mLogoutListeners.remove(logoutListener);
    }
}