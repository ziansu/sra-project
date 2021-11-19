public com.raizlabs.android.dbflow.sql.language.Where<ModelClass> and(com.raizlabs.android.dbflow.sql.builder.Condition condition) {
    mConditionQueryBuilder.putCondition(condition);
    return this;
}