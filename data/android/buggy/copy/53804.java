@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
    productListing.replace_fragment_upper(productModels.get(position_clciked));
    return true;
}