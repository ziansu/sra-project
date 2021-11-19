@org.junit.Test
public void testCreateAndArticleList() {
    articleController.createArticle("article");
    assertEquals("article", articleController.articleList().get(0).getReference());
}