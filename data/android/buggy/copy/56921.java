public void resetSelectedTags() {
    for (android.widget.CheckBox c : checkBoxes)
        c.setChecked(false);
    
    selectedStrings.clear();
}