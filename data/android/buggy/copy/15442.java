public static void initIfNeeded() {
    final com.samebug.clients.idea.SamebugIdeaPlugin plugin = com.samebug.clients.idea.SamebugIdeaPlugin.getInstance();
    if (!(com.samebug.clients.idea.SamebugIdeaPlugin.isInitialized()))
        com.samebug.clients.idea.intellij.settings.SettingsDialog.setup(plugin);
    
}