@java.lang.Override
public void setSeed(long seed) {
    super.setSeed(seed);
    iterator = source.listIterator(java.lang.Math.abs((seed % (source.size()))));
}