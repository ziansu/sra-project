@java.lang.Override
public int compare(com.pau101.neural.Life a, com.pau101.neural.Life b) {
    return java.lang.Long.compare(a.getFitness(), b.getFitness());
}