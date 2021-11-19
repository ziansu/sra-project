public int getNextId() {
    int r = ids.get(this.getRandom(0, ((ids.size()) - 1)));
    ids.remove(ids.indexOf(r));
    return r;
}