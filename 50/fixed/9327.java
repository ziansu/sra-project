public void killed() {
    alive = false;
    current.ants.remove(this);
    current.ants.trimToSize();
}