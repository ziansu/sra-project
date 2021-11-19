public void update(java.lang.Object msg) {
    waypointNavigator.wayptNav(msg.x, msg.y, msg.theta);
    if (waypointNavigator.isDone()) {
        fsm.updateState(new StateMachine.OrientAtDeposit(fsm));
    }
}