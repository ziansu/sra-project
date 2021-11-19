private void onScrollIdle() {
    ss.jaredluo.com.stickerselector.model.Nearest nearest = getNearestScrollOffset();
    android.util.Log.i("JARED", ("Nearest position: " + (nearest.getNearestPosition())));
    scrollViewToCenter(nearest);
}