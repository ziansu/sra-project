public int getLoss() {
    final int get = this.get;
    return get == 0 ? 0 : (100 * (destroy)) / get;
}