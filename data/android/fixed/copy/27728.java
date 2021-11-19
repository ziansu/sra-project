private boolean ReadMembers(com.brettonw.bag.BagObject bagObject, boolean first) {
    return ReadPair(bagObject) ? Expect(',') ? ReadMembers(bagObject, false) : true : first;
}