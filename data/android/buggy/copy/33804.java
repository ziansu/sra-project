public org.hyperic.hq.ui.action.admin.config.SystemConfigFormNG getModel() {
    if ((cForm) == null) {
        try {
            edit();
        } catch (java.lang.Exception e) {
            log.error(e);
        }
    }
    return cForm;
}