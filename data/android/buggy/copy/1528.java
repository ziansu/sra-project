private void notifyOnSlideToListeners(@android.support.annotation.NonNull
android.view.View bottomSheet, float slideOffset) {
    for (com.github.ljarka.filterbottomsheet.BottomSheetBehavior.BottomSheetCallback bottomSheetCallback : mCallback) {
        bottomSheetCallback.onSlide(bottomSheet, slideOffset);
    }
}