public static mw.fstraverse.tool.FSProcessor newFSProcessor(mw.fstraverse.tool.FSPlugins.FS_PLUGIN_TYPE type) {
    return mw.fstraverse.tool.FSPlugins.loadPlugin(type).newFSProcessor();
}