public void disenage() {
    org.cogaen.event.EventManager.getInstance(this.core).enqueueEvent(new game.event.LevelDisengagedEvent(this.name));
    for (game.motion.Rectangle struct : structures) {
        game.motion.MotionManager.getInstance(core).removeBody(struct);
    }
}