public static boolean setID(long id) {
    if ((com.mycompany.steamachievementtracker.SteamHandler.selected) != null) {
    }
    com.mycompany.steamachievementtracker.SteamHandler.selected = null;
    com.mycompany.steamachievementtracker.SteamHandler.selected = new com.mycompany.steamachievementtracker.Account(id, false);
    return true;
}