@java.lang.Override
public boolean hasNext() {
    return (currentIndex) < (((int) (java.lang.Math.pow(2, variables.size()))) - 1);
}