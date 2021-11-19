public int up(int id) {
    final int w = this.width;
    return id < w ? id + (w * ((this.height) - 1)) : id - w;
}