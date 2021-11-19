@java.lang.Override
public void setDebugMode(boolean debugMode) {
    if (debugMode == (debugMode_)) {
        return ;
    }
    debugMode_ = debugMode;
    loadDebugToolsIntoSecondaryToolbar();
}