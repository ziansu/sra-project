com.celements.navigation.cmd.ReorderSaveHandler getHandler() {
    if ((injected_Handler) != null) {
        return injected_Handler;
    }
    return new com.celements.navigation.cmd.ReorderSaveHandler();
}