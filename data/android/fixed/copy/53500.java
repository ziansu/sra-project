public void onPlayerWin() {
    currentStage.onMonsterKilled(player);
    main.Print.printDefeated(player, monster);
    player.onKillMonster(monster);
}