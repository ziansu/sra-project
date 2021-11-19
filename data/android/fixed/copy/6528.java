public java.util.List<hear.app.models.Article> getCacheArticles() {
    if ((mArticle) == null) {
        mArticle = new java.util.ArrayList(hear.app.store.CollectedArticleStore.getInstance().getArticles());
    }
    return mArticle;
}