private void reset(org.openl.rules.project.instantiation.ReloadType reloadType) {
    try {
        model.reset(reloadType, currentModule);
    } catch (java.lang.Exception e) {
        log.error("Error when trying to reset studio model", e);
    }
}