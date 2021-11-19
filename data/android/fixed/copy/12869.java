public void setNbits(int nbits) {
    this.nbits = nbits;
    this.hashFeatureEncoder = new xl.nbsvm.HashFeatureEncoder(nbits);
}