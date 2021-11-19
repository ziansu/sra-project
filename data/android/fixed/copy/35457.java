@java.lang.Override
public com.matteoveroni.mydiary.article.model.Article getLastArticle() {
    return ((com.matteoveroni.mydiary.article.model.Article) (databaseManager.read(com.matteoveroni.mydiary.article.model.hibernate.PersistentHibernateArticle.class, null, DAO.ElementOnWhichOperate.LAST)));
}