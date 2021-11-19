com.celements.navigation.cmd.ReorderSaveHandler getHandler(com.xpn.xwiki.XWikiContext context) {
    if ((injected_Handler) != null) {
        return injected_Handler;
    }
    return new com.celements.navigation.cmd.ReorderSaveHandler(context);
}