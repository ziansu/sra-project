public net.rainville.android.outstreamads.ArticleItem getArticleItem(java.util.UUID id) {
    for (net.rainville.android.outstreamads.ArticleItem articleItem : mArticleItems) {
        if ((articleItem.getArticleId()) == id) {
            return articleItem;
        }
    }
    return null;
}