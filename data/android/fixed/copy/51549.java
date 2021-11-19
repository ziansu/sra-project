public pages.ArticlePage editArticleBySaveAndClose() {
    click(BTN_SAVEANDCLOSE);
    return new pages.ArticlePage(driver);
}