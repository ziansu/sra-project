private void setColor(java.lang.String colorName) {
    mLabel.setText(colorName);
    mColor.setCircleColor(android.graphics.Color.parseColor(colorName));
}