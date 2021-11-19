private void animateSlideShow() {
    lastSlide = slide_0;
    lastDownAnim = R.anim.transition_down_center;
    lastUpAnim = R.anim.transition_up_center;
    timerHandler.post(timer);
}