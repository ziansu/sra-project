@java.lang.Override
final void stop() {
    this.inProgress = false;
    timer.cancel();
}