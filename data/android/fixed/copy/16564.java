private static void refreshAchievements() {
    org.dungeon.game.Game.getGameState().getHero().getAchievementTracker().update(GameData.ACHIEVEMENTS.values());
}