private static de.greenrobot.dao.query.QueryBuilder<com.vector.onetodo.db.gen.ToDo> filteredQuery() {
    return App.daoSession.getToDoDao().queryBuilder().where(LabelDao.Properties.Label_name.eq(com.vector.onetodo.TaskByLabelFragment.labelName)).orderAsc(Properties.Start_date);
}