@java.lang.Override
public void dump() {
    java.lang.System.out.println("yy");
    BuildList();
    Tuple.Tuple a = getNextTuple();
    while (a != null) {
        java.lang.System.out.println(a.getTuple());
        a = getNextTuple();
    } 
}