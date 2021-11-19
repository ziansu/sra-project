public void collectEntries() {
    for (int i = 0; i < (editTexts.length); i++) {
        statCategoriesArray[i] = editTexts[i].getText().toString();
    }
}