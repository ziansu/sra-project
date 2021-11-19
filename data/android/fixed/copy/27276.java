@java.lang.Override
public com.orientechnologies.orient.core.record.impl.ODocument reload(final java.lang.String fetchPlan, final boolean ignoreCache) {
    super.reload(fetchPlan, ignoreCache);
    if (!(_lazyLoad)) {
        checkForLoading();
        checkForFields();
    }
    return this;
}