private static void printTime() {
    org.dungeon.io.IO.writeString(org.dungeon.game.Game.getGameState().getWorld().getWorldDate().toTimeString());
}