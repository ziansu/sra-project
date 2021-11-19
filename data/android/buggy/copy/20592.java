private void initLocalMap() throws java.lang.Throwable {
    java.lang.String xmlParams = this.getConfigManager().getConfigItem(SystemConstants.CONFIG_ITEM_PARAMS);
    java.util.Map<java.lang.String, java.lang.String> systemParams = com.agiletec.aps.system.services.baseconfig.SystemParamsUtils.getParams(xmlParams);
    this.setSystemParams(systemParams);
}