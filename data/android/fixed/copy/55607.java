public void collectEntries() {
    for (int i = 0; i < (statCategoriesArray.length); i++) {
        statCategoriesArray[i] = editTexts[i].getText().toString();
    }
}