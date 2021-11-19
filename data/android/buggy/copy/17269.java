public void tick(com.gmail.jakekinsella.map.Map map) {
    this.currentRoutine.execute(map);
    if (this.isRoutineFinished()) {
        this.currentRoutine = null;
    }
}