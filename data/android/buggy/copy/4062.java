public void onBookmarkAdd(com.pindroid.providers.BookmarkContent.Bookmark b) {
    startActivity(com.pindroid.action.IntentHelper.AddBookmark(b.getUrl(), mAccount.name, this));
}