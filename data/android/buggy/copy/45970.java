private int createBundle(int varValueIndex) {
    int bundleIndex = com.rfo.basic.Run.theBundles.size();
    com.rfo.basic.Run.NumericVarValues.set(varValueIndex, ((double) (bundleIndex)));
    com.rfo.basic.Run.theBundles.add(new android.os.Bundle());
    return bundleIndex;
}