public boolean saveDataBean(com.jadic.biz.bean.DBSaveBean dataBean) {
    return (executeUpdateSingle(dataBean.getSql(), dataBean.getParams())) != (-1);
}