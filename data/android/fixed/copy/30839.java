@java.lang.Override
public void saveOrUpdate(T entity) {
    int i = com.ccloomi.core.common.dao.GenericDao.update(entity);
    if (i != 1) {
        save(entity);
    }
}