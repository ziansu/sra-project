@java.lang.Override
public void setDebugMode(boolean debugMode) {
    debugMode_ = debugMode;
    loadDebugToolsIntoSecondaryToolbar();
}