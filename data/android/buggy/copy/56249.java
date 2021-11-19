public int startSowing() {
    int seedsToSow = this.numSeeds;
    StdOut.println((("Sowing " + seedsToSow) + " seeds."));
    return this.nextPit.sowSeed(seedsToSow);
}