private void updateMatchesString() {
    java.lang.String template = mBrowserActivity.getResources().getQuantityString(R.plurals.matches_found, mNumberOfMatches, mNumberOfMatches);
    mMatches.setText(template);
}