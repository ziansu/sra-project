public void clockEdge() {
    if (new BinaryNum("0").equals(control)) {
        pcOut.setValue(pcIn.getValue());
    }
}