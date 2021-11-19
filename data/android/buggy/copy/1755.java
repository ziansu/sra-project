@java.lang.Override
void deathProcess() {
    timer.cancel();
    timer = null;
}