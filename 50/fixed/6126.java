public void execute() {
    for (com.intellij.openapi.module.Module module : toRemove) {
        module.clearOption(PantsConstants.PANTS_TARGET_ADDRESSES_KEY);
    }
}