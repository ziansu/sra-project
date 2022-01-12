public void handleViewSelection(boolean selected) {
    monthTextView.setTextColor((selected ? selectedTextColor : baseTextColor));
    monthTextView.setBackground((selected ? selectedBackground : background));
}