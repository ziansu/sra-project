public static mw.fstraverse.tool.FSProcessor newFSProcessor(mw.fstraverse.tool.FSPlugins.FS_PLUGIN_TYPE type) {
    mw.fstraverse.tool.FSProcessor fsProcessor = mw.fstraverse.tool.FSPlugins.loadPlugin(type).newFSProcessor();
    if (fsProcessor == null) {
        mw.fstraverse.tool.FSPlugins.logger.severe(("fsProcessor is null for " + type));
    }
    return fsProcessor;
}