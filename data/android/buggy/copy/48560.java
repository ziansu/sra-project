public void dismiss() {
    dismissed = true;
    if ((mPopupWindow) != null) {
        mPopupWindow.dismiss();
    }
}