@java.lang.Override
public java.util.List<T> findAll(org.springframework.data.domain.Sort sort, java.lang.String selects) {
    return db().find(getEntityType()).select(selects).setOrder(org.springframework.data.ebean.convert.PageListOrderConverter.convertToEbeanOrder(sort)).findList();
}