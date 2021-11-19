@java.lang.Override
public void dump() {
    Tuple.Tuple a = getNextTuple();
    while (a != null) {
        java.lang.System.out.println(a.getTuple());
        a = getNextTuple();
    } 
}