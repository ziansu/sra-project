@java.lang.Override
public void onRestoreInstanceState(android.os.Parcelable state) {
    com.nearit.ui_bindings.feedback.views.NearItUIRatingBar.SavedState savedState = ((com.nearit.ui_bindings.feedback.views.NearItUIRatingBar.SavedState) (state));
    super.onRestoreInstanceState(savedState.getSuperState());
    setRating(savedState.rating);
}