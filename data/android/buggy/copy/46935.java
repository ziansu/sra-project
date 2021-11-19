public int getNextId() {
    int r = ids.get(this.getRandom(0, ids.size()));
    ids.remove(ids.indexOf(r));
    return r;
}