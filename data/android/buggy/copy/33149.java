public java.lang.String getListType() {
    if ((listType) == null) {
        listType = com.ozpathway.sw.erms.webapp.utils.FacesUtils.getRequestParameter(ConstantsBean.REPORT_LIST_TYPE);
    }
    return listType;
}