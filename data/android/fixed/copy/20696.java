@java.lang.Override
protected java.util.Map<java.lang.String, java.lang.String> getConfigs() {
    java.util.Map<java.lang.String, java.lang.String> configs = new java.util.HashMap(super.getConfigs());
    configs.put("programRunId", co.cask.cdap.common.twill.TwillAppLifecycleEventHandler.GSON.toJson(programRunId));
    return configs;
}