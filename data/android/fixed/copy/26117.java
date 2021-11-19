public boolean hideTutorial() {
    hide(getContext().getResources().getInteger(R.integer.navigation_layout_tutorial_hide_animation_duration_milliseconds), true);
    return isShownAsTutorial = false;
}