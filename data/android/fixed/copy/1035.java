@java.lang.Override
public boolean onBackPressed() {
    if ((bottomSheetBehavior.getState()) == (android.support.design.widget.BottomSheetBehavior.STATE_EXPANDED)) {
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    }
    return true;
}