@java.lang.Override
public int compare(int i1, int i2) {
    return (vars[i1].getDomainSize()) - (vars[i2].getDomainSize());
}