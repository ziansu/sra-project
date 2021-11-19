public CloneableTime cloneItself() throws java.lang.CloneNotSupportedException {
    CloneableTime theClone = ((CloneableTime) (super.clone()));
    theClone.setTime(0, 0, 0);
    return theClone;
}