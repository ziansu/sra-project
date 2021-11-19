private static void loadDefaultLogTypes() {
    com.marz.snapprefs.Logger.log("Loading default LogTypes", com.marz.snapprefs.Logger.LogType.FORCED);
    java.util.Collections.addAll(com.marz.snapprefs.Logger.logTypes, com.marz.snapprefs.Logger.LogType.values());
    com.marz.snapprefs.Logger.saveSelectedLogTypes();
}