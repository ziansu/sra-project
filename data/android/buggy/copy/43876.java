public com.jfinal.plugin.activerecord.Page<io.jpress.model.Content> doPaginateByModuleInNormal(int page, int pagesize, java.lang.String module) {
    return doPaginate(pagesize, pagesize, module, io.jpress.model.Content.STATUS_NORMAL, 0, 0, null);
}