public static void startUp() {
    Main.Music.musicStartup();
    Main.Main.addCommands();
    Main.ConsoleListener console = new Main.ConsoleListener();
    Main.Music.musicStartup();
    Setting.SmartLogger.updateLog("Bot Start Up. Commands Added.");
}