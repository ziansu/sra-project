@java.lang.Override
protected boolean equals(com.mkyong.helloworld.value.AbstractValue other) {
    if (!(other instanceof com.mkyong.helloworld.value.TheDate)) {
        return false;
    }
    com.mkyong.helloworld.value.TheDate _other = ((com.mkyong.helloworld.value.TheDate) (other));
    return this.date.equals(_other.date);
}