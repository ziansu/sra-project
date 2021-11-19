void fillReduce() {
    Firstplus fp = new Firstplus(grammer);
    fp.run();
    follow = fp.getFollow();
    for (State state : automaton) {
        fillReduce(state);
    }
}