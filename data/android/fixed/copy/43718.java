@java.lang.Override
public int compare(java.lang.Integer i1, java.lang.Integer i2) {
    return (weights[i1]) > (weights[i2]) ? 1 : (weights[i1]) > (weights[i2]) ? 0 : -1;
}