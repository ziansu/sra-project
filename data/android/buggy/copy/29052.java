public models.Article getArticle(java.lang.Long id) {
    models.Article article = objectify.get().load().type(models.Article.class).filterKey(id).first().now();
    return article;
}