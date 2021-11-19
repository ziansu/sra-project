public void initOnNewTurn(battlecode.common.RobotController rc) throws battlecode.common.GameActionException {
    field.addParticle(elm.predictEnemyBase(rc));
    elm.onNewTurn();
    rcWrapper.initOnNewTurn();
}