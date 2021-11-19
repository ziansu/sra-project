@java.lang.Override
public java.lang.Long getDBValue(java.sql.Date model) {
    return model == null ? null : model.getTime();
}