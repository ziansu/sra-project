public void newDuel() {
    players.get(com.engine.Engine.ATTACKER).draw(3);
    players.get(com.engine.Engine.DEFENDER).draw(4);
    turn = 0;
}