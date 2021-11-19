@java.lang.Override
public java.lang.String getSubjectSortType(java.lang.String sessionkey, java.lang.String isPreparation) {
    de.thm.arsnova.entities.SortOrder sortOrder = databaseDao.getSortOrder(sessionkey, isPreparation, "");
    return sortOrder.getSortType();
}