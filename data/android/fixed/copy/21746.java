public static void setBattle(battle.Battle battle, boolean seenWild) {
    ((gui.view.map.BattleState) (gui.view.map.VisualState.BATTLE.handler)).setBattle(battle, seenWild);
}