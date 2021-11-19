public main.java.binBeats.lib.BinBeat loadBinBeat(java.lang.String bn) {
    int position = this.searchBeatName(bn);
    if (position >= 0) {
        return beatList.get(position);
    }
    return null;
}