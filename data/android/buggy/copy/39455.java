private boolean deepEquals(net.tudelft.hi.e.data.Record other) {
    return ((equalTableName(other)) && (equalKeysInOrder(other))) && (equalSuper(other));
}