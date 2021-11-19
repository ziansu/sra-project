private void addEnemy(game.Enemy e) {
    enemies.add(e);
    game.gamestate.SamplePlay2.entityLayers.addRenderer(e, 0);
    java.lang.System.out.println(enemies.size());
}