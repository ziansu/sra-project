@java.lang.Override
public int compare(int i1, int i2) {
    return (vars[sortedidx[i1]].getDomainSize()) - (vars[sortedidx[i2]].getDomainSize());
}