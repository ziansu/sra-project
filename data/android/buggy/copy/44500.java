@java.lang.Override
public void saveArticle(com.tvntd.models.Article article) {
    createArticleRank(article);
    articleRepo.save(article);
}