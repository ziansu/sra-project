@java.lang.Override
public void deleteBy(java.lang.String fields, java.lang.Object... values) throws java.lang.IllegalArgumentException {
    act.db.ebean.EbeanQuery<MODEL_TYPE> q = q(fields, values);
    ebean().delete(q);
}