public static int optimalCharArraySize(int desiredSize) {
    return (de.dimensionv.android.androtools.datastructures.arrays.ArraySizeTools.optimalByteArraySize((desiredSize << 1))) >>> 1;
}