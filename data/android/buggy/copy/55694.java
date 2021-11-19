@java.lang.Override
public boolean hasNext() {
    if ((sourceA.hasNext()) && (sourceB.hasNext())) {
        return true;
    }else {
        return false;
    }
}