private void onScrollIdle() {
    ss.jaredluo.com.stickerselector.model.Nearest nearest = getNearestScrollOffset();
    scrollViewToCenter(nearest);
}