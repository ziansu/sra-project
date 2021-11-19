public void deactivateListItem(android.widget.LinearLayout linearLayout) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.HONEYCOMB)) {
        linearLayout.setActivated(false);
    }else {
        linearLayout.setSelected(false);
    }
}