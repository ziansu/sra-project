private double genRand(me.thebutlah.valuenoise.Point point) {
    double temp = hashFunction.hashInts(point.pos);
    double result = temp / (java.lang.Long.MAX_VALUE);
    return result;
}