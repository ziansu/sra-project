public boolean hideTutorial() {
    return hide(getContext().getResources().getInteger(R.integer.navigation_layout_tutorial_hide_animation_duration_milliseconds), true);
}