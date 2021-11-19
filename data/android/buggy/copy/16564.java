private static void refreshAchievements() {
    org.dungeon.entity.creatures.Hero hero = org.dungeon.game.Game.getGameState().getHero();
    hero.getAchievementTracker().update(GameData.ACHIEVEMENTS.values());
}