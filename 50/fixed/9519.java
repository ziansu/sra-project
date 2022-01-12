@java.lang.Override
protected void setSelectionForAll(java.lang.Boolean selected) {
    for (org.dcache.webadmin.view.beans.PoolSpaceBean bean : _poolBeans) {
        bean.setSelected(selected);
    }
}