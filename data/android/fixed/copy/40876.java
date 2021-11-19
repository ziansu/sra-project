public boolean hasMD5() {
    return ((this.md5) != null) && (!(this.md5.equals(Hashing.HashCode.EMPTY)));
}