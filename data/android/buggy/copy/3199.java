private void checkBoundary(int v, int min, int max) throws java.lang.IndexOutOfBoundsException {
    if ((v < min) || (v > max))
        throw new java.lang.IndexOutOfBoundsException();
    
}