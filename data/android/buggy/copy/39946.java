public reactor.fn.timer.HashWheelTimer.TimerRegistration<T> cancelAfterUse() {
    cancelAfterUse.set(false);
    return this;
}