public com.liferay.training.newsletter.model.Article getArticleByJournalArticleId(java.lang.String journalArticleId) throws com.liferay.portal.kernel.exception.SystemException, com.liferay.training.newsletter.NoSuchArticleException {
    return articlePersistence.findByJournalArticleId(journalArticleId);
}