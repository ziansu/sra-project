private void setShareIntent(android.content.Intent shareIntent) {
    if (((mShareActionProvider) != null) && ((listViewScores.getItemAtPosition(0)) != null)) {
        mShareActionProvider.setShareIntent(shareIntent);
    }
}