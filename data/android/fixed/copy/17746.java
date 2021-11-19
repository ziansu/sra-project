private static void invalidate(android.content.Context context) {
    com.mishiranu.dashchan.widget.ClickableToast clickableToast = com.mishiranu.dashchan.widget.ClickableToast.TOASTS.get(com.mishiranu.dashchan.widget.ClickableToast.obtainBaseContext(context));
    if ((clickableToast != null) && (clickableToast.mShowing))
        clickableToast.updateLayoutAndRealClickable();
    
}