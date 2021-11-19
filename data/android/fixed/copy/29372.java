public final synchronized void addAction(ru.dk.gdxGP.GameWorld.ActionForNextStep action) {
    synchronized(this.actions) {
        if ((action == (ru.dk.gdxGP.GameWorld.Level.moveAction)) && (isMoveActionPresent())) {
            return ;
        }
        this.actions.add(action);
    }
}