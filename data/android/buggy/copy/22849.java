public static void readRules(java.io.File directory) {
    mcjty.incontrol.rules.RulesManager.path = directory.getPath();
    mcjty.incontrol.rules.RulesManager.readAllRules();
}