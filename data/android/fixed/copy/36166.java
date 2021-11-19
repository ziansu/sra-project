public engine.ValidationState start() {
    callWave();
    for (engine.PhysicalEntity pe : physicalEntities) {
        timer.schedule(pe.getTimerTask(), 0, pe.getInterval());
    }
    return ValidationState.VALID;
}