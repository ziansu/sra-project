public static void printDebugCon(java.lang.String line) {
    if (me.tehbeard.BeardStat.BeardStat.self.getConfig().getBoolean("general.debug", false)) {
        java.lang.System.out.println(("[BeardStat][DEBUG] " + line));
    }
}