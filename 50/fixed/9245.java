public void hideFooterView() {
    footerTextView.setText("Pull up to refresh");
    footerView.setPadding(0, 0, 0, (-(footerHeight)));
    state = -1;
}