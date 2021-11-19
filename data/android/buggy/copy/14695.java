@java.lang.Override
public java.lang.String getQuestionSortType(java.lang.String session, java.lang.String subject, java.lang.String isPreparation) {
    de.thm.arsnova.entities.SortOrder sortOrder = databaseDao.getSortOrder(sessionkey, isPreparation, subject);
    return de.thm.arsnova.entities.SortOrder.getSortType();
}