@java.lang.Override
public void onBackPressed() {
    if ((mBottomSheetBehavior.getState()) == (android.support.design.widget.BottomSheetBehavior.STATE_EXPANDED)) {
        android.util.Log.d("CDA", "onKeyDown Called");
        mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    }else {
        super.onBackPressed();
    }
}