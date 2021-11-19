public models.Article getArticle(java.lang.Long id) {
    models.Article article = objectify.get().load().type(models.Article.class).id(id).now();
    return article;
}