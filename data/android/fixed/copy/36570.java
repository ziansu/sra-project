public void nextTurn() {
    java.lang.System.out.println(active);
    if ((active) == (com.engine.Engine.ATTACKER)) {
        active = com.engine.Engine.DEFENDER;
    }else {
        active = com.engine.Engine.ATTACKER;
        newTurn();
    }
    turn(active);
}