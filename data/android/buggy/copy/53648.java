private void setApiData2StatusCodes() {
    cn.ytxu.http_wrapper.model.status_code.StatusCodeGroupModel scGroup = cn.ytxu.http_wrapper.apidocjs.bean.ApidocjsHelper.getApiData().createStatusCodeGroup(version, apiData);
    version.addStatusCodeGroup(scGroup);
}