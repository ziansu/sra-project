@com.google.common.annotations.VisibleForTesting
void setApplicationSpecification(co.cask.cdap.api.app.ApplicationSpecification spec) {
    hConf.set(co.cask.cdap.internal.app.runtime.batch.MapReduceContextConfig.HCONF_ATTR_APP_SPEC, co.cask.cdap.internal.app.runtime.batch.MapReduceContextConfig.GSON.toJson(spec, co.cask.cdap.api.app.ApplicationSpecification.class));
}