private void updateCycle() {
    if ((pause) == true) {
        return ;
    }
    (cycle)++;
    if ((cycle) >= (gui.AbstractModePlayer.MAX_CYCLE)) {
        cycle = 0;
    }
}