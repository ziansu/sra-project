private double genRand(me.thebutlah.valuenoise.Point point) {
    double temp = hashFunction.hashInts(point.pos);
    return temp / (java.lang.Long.MAX_VALUE);
}