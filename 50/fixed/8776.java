public java.lang.String asStringTree() {
    java.lang.String result = tree.toStringTree(parser);
    com.whelanlabs.gameRuleBacktracker.Game.logger.debug(("App.getStringTree() result = " + result));
    return result;
}