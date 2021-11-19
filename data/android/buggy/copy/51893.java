private void goToRibbons() {
    updateDatabaseWithRibbon();
    android.content.Intent ribbonIntent = new android.content.Intent(getApplicationContext(), com.lerenard.bible.RibbonActivity.class).putExtra(com.lerenard.bible.ReadingActivity.RIBBON_KEY, ribbon);
    startActivityForResult(ribbonIntent, com.lerenard.bible.ReadingActivity.SELECT_RIBBON_CODE);
}