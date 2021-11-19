public final BinaryNum setIfLessThan(BinaryNum other) {
    if ((this.toInt()) < (other.toInt())) {
        return new BinaryNum("1");
    }else {
        return new BinaryNum("0");
    }
}