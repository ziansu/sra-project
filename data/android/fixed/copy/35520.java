public void setTabText(java.lang.String text) {
    if ((current_tab_position) != (-1)) {
        ((android.widget.TextView) (tabMenuView.getChildAt(current_tab_position))).setText(text);
    }
}