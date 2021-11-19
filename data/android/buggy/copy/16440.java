private void setHeadline(java.lang.String clickedItem) {
    java.lang.String headlineText = clickedItem;
    android.widget.TextView headline = ((android.widget.TextView) (findViewById(R.id.header)));
    headline.setText(clickedItem);
}