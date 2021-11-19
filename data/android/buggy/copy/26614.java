@java.lang.Override
public leap.orm.query.Query<T> params(leap.lang.params.Params params) {
    if (null != params) {
        this.params.putAll(params.map());
    }
    return this;
}