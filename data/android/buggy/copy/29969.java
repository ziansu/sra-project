public boolean die(Client dest, Client src, Player newPosition) {
    assert (maze) != null;
    if (maze.clientDie(dest, src, newPosition)) {
        notifyDie();
        return true;
    }else {
        return false;
    }
}