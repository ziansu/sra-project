private void arrangeLayoutAccordingToScreenOrientation(final int orientation) {
    imageParentFrame.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {
        @java.lang.Override
        public void onGlobalLayout() {
            arrangeLayoutAccordingToScreenOrientation_priv(orientation);
            imageParentFrame.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    });
}