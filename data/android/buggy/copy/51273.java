public static void onPlayerWin(entities.EntityPlayer player, entities.EntityMonster monster, main.Main.Difficulty difficulty) {
    main.Print.printDefeated(player, monster);
    player.onKillMonster(monster);
    main.Main.battleActive(player, monster, difficulty);
}