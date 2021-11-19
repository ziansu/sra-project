private void reset(org.openl.rules.project.instantiation.ReloadType reloadType) {
    try {
        model.setModuleInfo(currentModule);
        model.reset(reloadType);
    } catch (java.lang.Exception e) {
        log.error("Error when trying to reset studio model", e);
    }
}