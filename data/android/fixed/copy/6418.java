private boolean setShareIntent(android.content.Intent shareIntent) {
    if ((mShareActionProvider) != null) {
        mShareActionProvider.setShareIntent(shareIntent);
        return true;
    }
    return false;
}