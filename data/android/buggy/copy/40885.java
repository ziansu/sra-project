public org.hetc.binaryNumber.BinaryNumber add(org.hetc.binaryNumber.BinaryNumber bin) {
    return new org.hetc.binaryNumber.BinaryNumber(internalAdd(this.binary, bin.binary));
}