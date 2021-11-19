public void update(long window) {
    double nstate = key.getState();
    delta = nstate - (state);
    state = nstate;
}