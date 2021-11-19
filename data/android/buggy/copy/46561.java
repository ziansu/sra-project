public void dismiss() {
    if (isShowing()) {
        layout.dismiss();
        _showCount = 0;
        _showing = false;
    }
}