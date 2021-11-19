public static boolean checkUpdates() {
    return (softwareInfo.version) != (update.update.getUpdatesInfo(update.update.UPDATE_URL).optLong("Version", 0));
}