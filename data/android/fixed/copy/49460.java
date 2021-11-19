private void doLockScreenAnimation() {
    android.view.View lockScreen = mWrapperView.findViewById(R.id.lock_screen_interaction_container);
    lockScreen.animate().translationX(0);
}